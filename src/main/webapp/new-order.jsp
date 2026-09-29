<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 9/28/2026
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>New Order</title>
</head>
<body>

<h2>
    New Order
</h2>

<form method="post" action="order">
    <label>
        Customer Name:
    </label>
    <input type="text" name="customerName" value="${customerName}" placeholder="Enter your name" required>

    <label>
        Product Name:
    </label>
    <input type="text" name="productName" placeholder="Enter product name" required>

    <label>
        Product Price:
    </label>
    <input type="number" name="price" min="0" step="0.01" placeholder="Enter product price" required>

    <label>
        Quantity:
    </label>
    <input type="number" name="quantity" min="1" placeholder="Enter product quantity" required>

    <button type="submit">
        Add
    </button>
</form>

</body>
</html>
