package ir.maktabsharif.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.math.BigDecimal;

@WebServlet(name = "OrderManagementServlet", value = "/order")
public class OrderManagementServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerName = req.getParameter("customerName");
        String productName = req.getParameter("productName");
        BigDecimal price = new BigDecimal(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));

        if (price.compareTo(BigDecimal.ZERO) < 0) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Price cannot be negative!");
            return;
        }

        if (quantity < 1) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Quantity cannot lower than 1!");
            return;
        }

        BigDecimal totalPrice = price.multiply(BigDecimal.valueOf(quantity));

        HttpSession session = req.getSession();

        session.setAttribute("customerName", customerName);
        session.setAttribute("productName", productName);
        session.setAttribute("price", price);
        session.setAttribute("quantity",quantity);

        session.setAttribute("totalPrice", totalPrice);


        Cookie cookie = new Cookie("customerName", customerName);
        resp.addCookie(cookie);


        req.setAttribute("customerName", customerName);
        req.setAttribute("productName", productName);
        req.setAttribute("price", price);
        req.setAttribute("quantity",quantity);

        req.setAttribute("totalPrice", totalPrice);

        req.getRequestDispatcher("order-result.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerName = "";

        Cookie[] cookies = req.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("customerName")) {
                    customerName = cookie.getValue();
                    break;
                }
            }
        }

        req.setAttribute("customerName", customerName);

        req.getRequestDispatcher("new-order.jsp").forward(req, resp);
    }
}
