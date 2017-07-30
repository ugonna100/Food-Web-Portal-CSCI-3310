<%-- 
    Document   : listCart
    Created on : Nov 30, 2016, 1:42:59 PM
    Author     : Bakuano
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="<c:url value="style.css" />" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Cart</title>
    </head>
    <body>
        <h1>Shopping Cart</h1>
        <table border="1">
            <thead>
                <th>Username</th>
                <th>Restaurant Name</th>
                <th>Delivery Address</th>
                <th>Delivery Time</th>
                <th>Quantity</th>
                <th>Payment Option</th>
            </thead>
            <tbody>
                <c:forEach items="${order}" var="order">
                    <tr>
                        <td>
                            <c:out value="${order.username}" />
                        </td>
                        <td>
                            <c:out value="${order.restName}" />
                        </td>
                        <td>
                            <c:out value="${order.delivAddress}" />
                        </td>
                        <td>
                            <c:out value="${order.delivTime}" />
                        </td>
                        <td>
                            <c:out value="${order.quantity}" />
                        </td>
                        <td>
                            <c:out value="${order.paymentOption}" />
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
