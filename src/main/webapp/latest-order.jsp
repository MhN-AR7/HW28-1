<%@ page import="java.math.BigDecimal" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 9/28/2026
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Latest Order</title>
</head>
<body>

<h2>
    Latest Order
</h2>

<%
    String customerName = (String) session.getAttribute("customerName");
    String productName = (String) session.getAttribute("productName");
    BigDecimal price = (BigDecimal) session.getAttribute("price");
    int quantity = (int) session.getAttribute("quantity");
    BigDecimal totalPrice = (BigDecimal) session.getAttribute("totalPrice");
%>

<p>
    Customer Name: <%=customerName%>
</p>

<p>
    Product Name: <%=productName%>
</p>

<p>
    Price: <%=price%>$
</p>

<p>
    Quantity: <%=quantity%>
</p>

<hr>

<p>
    <strong>
        Total Price: <%=totalPrice%>$
    </strong>
</p>

<hr>

<form action="index.jsp">
    <button type="submit">
        Home
    </button>
</form>

<form action="new-order.jsp">
    <button type="submit">
        New Order
    </button>
</form>

</body>
</html>
