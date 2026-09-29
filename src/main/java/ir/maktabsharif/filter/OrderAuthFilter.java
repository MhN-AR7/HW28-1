package ir.maktabsharif.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebFilter("/latest-order.jsp")
public class OrderAuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        HttpSession session = req.getSession(false);

        if (session == null) {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Session not found!");
            return;
        }

        String customerName = (String) session.getAttribute("customerName");
        String productName = (String) session.getAttribute("productName");

        if (customerName==null || productName==null) {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Session not correct!");
            return;
        }

        filterChain.doFilter(req, resp);
    }
}
