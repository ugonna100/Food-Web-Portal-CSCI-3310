<%-- 
    Document   : cart
    Created on : Dec 1, 2016, 7:55:16 AM
    Author     : Bakuano
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Search Results</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Oswald|Slabo+27px|Vollkorn|Yellowtail" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Bungee+Inline|Exo" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<link href="<c:url value= "style.css" />" rel="stylesheet">
    </head>
    <nav class="navbar navbar-inverse navbar-fixed-top" id="navbar" style="font-size: 1.5em;">
	<div class="container-fluid font2">
            <ul class="nav navbar-nav navbar-left">
                <li><a href="dashboard.html" style="margin-left: -10%;">EbolaDragons</a></li>
            </ul>
            <div class="navbar-header">
                <a class="navbar-brand" href="#">
                    <img class="logo" id="navBarIcon" style="margin-left: -70%;" src="logo.png">
                </a>
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li style="padding-top: 10px;">
                    <form action="ListCartServlet" method="get">
                        <button type="submit" name="cart" value="cart" class="buttonColor"><i class="fa fa-shopping-cart"></i> Cart</button>
                    </form>
                </li>
                <li style="margin-right: -10px;"><a href="changeSettings.jsp"><i class="fa fa-cog"></i> Settings</a></li>
                <li>
                    <a href="restSearch.jsp"><i class="fa fa-search-plus"></i> Search</a>
                </li>
            </ul>
	</div>
    </nav>
    <body class="login font2">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2" style="margin-top:5%;">
                        <img src="logo.png">
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-8 col-sm-offset-2">
                        <div class="form-box">
                            <div class="form-top">
                                <div class="left">
                                    <h3 style="padding-bottom: 15px;">Search</h3>
                                    <p>Enter a restaurant name or category of food:</p>
                                </div>
                                <div class="right" style="margin-top: 10px;">
                                    <i class="fa fa-search-plus"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                <table class="table table-hover">
                                    <thead>
                                        <th>Restaurant Name</th>
                                        <th>Dish name</th>
                                        <th>Price</th>
                                        <th>Delivery Address</th>
                                        <th>Payment Option</th>
                                        <th>Quantity</th>
                                        <th> </th>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${cartList}" var="cart">
                                            <tr>
                                                <td>
                                                    <c:out value="${cart.restName}" />
                                                </td>
                                                <td>
                                                    <c:out value="${cart.dishName}" />
                                                </td>
                                                <td>
                                                    <c:out value="${cart.price}" />
                                                </td>
                                                <td>
                                                    <c:out value="${cart.deliveryAddress}" />
                                                </td>
                                                <td>
                                                    <c:out value="${cart.payment}" />
                                                </td>
                                                <td>
                                                    <c:out value="${cart.quantity}" />
                                                </td>
                                                <td>
                                                    <form action="DeleteFromCartServlet" method="post">
                                                        <input type="checkbox" name="menuFood" value ="${cart.dishName}" checked style="display: none;">
                                                        <button type="submit" class="btn buttonColor" value="Submit" id="rsubmit">Remove from cart</button>
                                                    </form>
                                                </td>
                                                <form action="UpdateCartServlet" method="post">
                                                    <td class="text-center">
                                                        <input type="checkbox" name="menuFood" value ="${cart.dishName}" checked style="display: none;">
                                                        <input type="text" name="quantity" value="${cart.quantity}" style="width: 50%; height: 50%;">
                                                    </td>
                                                    <td>
                                                        <button type="submit" class="btn buttonColor" value="Submit" id="rsubmit">Update</button>
                                                    </td>
                                                </form>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <form action="OrderFromCartServlet" method="post">
                                    <button type="submit" class="btn buttonColor" style="width: 25%;" value="Submit" id="rsubmit">Order</button>
                                </form>
                            </div>
                        </div>
                        <p style="color: white; padding-top: 15px;">--------------- Head on back? ---------------</p>
                        <a href="dashboard.html"<button type="button" class="btn buttonColor"><i class="fa fa-home"></i> Home</button></a>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
