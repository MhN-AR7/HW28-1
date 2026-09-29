## Exercise 1 — Simple Online Store Order System
### Scenario
You are developing a simple web application for a small online store.
The store does not need a database yet. The goal is to build a simple order flow where a customer can enter an order, submit it, view the calculated result, and access their latest order information.
The application should demonstrate how Servlets and JSP work together and how Request, Session, Cookie, and Filter can be used in a web application.
The application should be simple and focus on the concepts covered during the training sessions.
### Requirements
The application must provide a page where the customer can create a new order.
The customer should be able to enter:
•
Customer name
•
Product name
•
Product price
•
Quantity
After submitting the order, the application must calculate the total price based on the product price and quantity.
The result page should display the complete order information, including the calculated total price.
The order processing must be handled by a Servlet, while the user interface must be implemented using JSP.
The application should use Expression Language (EL) to display data on JSP pages.
At least one JSP page should demonstrate the use of JSP Expression, JSP Scriptlet, and JSP Directive.
The application should have a separate page where the customer can view information about their latest order.
The latest order information should be stored in the HTTP Session so that it can be accessed from another request.
The application should also use a Cookie to remember the customer's name.
When the customer visits the order page again, if their name exists in the Cookie, the application should use it as the default customer name.
The application must also contain a Filter that protects the customer's order information page.
If the required customer information exists in the Session, the customer can access the page.
If the required Session information does not exist, the customer should be redirected to the order page.
The application should provide a way for the customer to create another order after viewing the result.
The application should use appropriate HTTP methods for different operations.
The application should demonstrate forwarding between a Servlet and JSP where appropriate.
### Required Concepts
The implementation must include and demonstrate:
•
Servlet
•
doGet
•
doPost
•
JSP
•
JSP Expression
•
JSP Scriptlet
•
JSP Directive
•
Expression Language (EL)
•
Request attributes
•
Request parameters
•
Request forwarding
•
Session
•
Cookie
•
Filter
•
Redirect
•
HTML Form
### Expected Flow
The general application flow should be similar to:
Create Order Submit Order Calculate Order Display Result Store →→→→Information in Session/Cookie Access Latest Order→
The exact page names, URLs, class names, and implementation details are up to you.