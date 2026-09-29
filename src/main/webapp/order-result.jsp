<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 9/28/2026
  Time: 3:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Order Result</title>
</head>
<body>

<h2>
    Order Result
</h2>

<p>
    Customer Name: ${customerName}
</p>

<p>
    Product Name: ${productName}
</p>

<p>
    Price: ${price}$
</p>

<p>
    Quantity: ${quantity}
</p>

<hr>

<p>
    <strong>
        Total Price: ${totalPrice}$
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

<form action="latest-order.jsp">
    <button type="submit">
        Latest Order
    </button>
</form>

</body>
</html>
