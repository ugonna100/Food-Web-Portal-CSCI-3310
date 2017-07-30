<%-- 
    Document   : restRegister
    Created on : Nov 27, 2016, 5:48:00 PM
    Author     : Bakuano
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="<c:url value= "style.css" />" rel="stylesheet">
        <link href="<c:url value= "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />" rel="stylesheet">
        <link href="<c:url value= "https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />" rel="stylesheet">
        <link href="<c:url value= "https://fonts.googleapis.com/css?family=Bungee+Inline|Exo" />" rel="stylesheet" >
        <script src="effects.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body class="register font2" style="color: white">
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2" style="margin-top:0%;">
                    <img src="logo.png" style="transform: scale(0.8, 0.8)">
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                    <div class="form-box" style="color: black;">
                        <div class="form-top">
                            <div class="left">
                                <h3 style="padding-bottom: 15px;">Create account</h3>
                                <p>Enter your restaurant information</p>
                            </div>
                            <div class="right" style="margin-top: 10px;">
                                <i class="fa fa-lock"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            <form action="RegisterRestaurantServlet" method="post">
                                <div class="form-group">
                                    <label class="sr-only" for="form-username">Restaurant name</label>
                                    <input type="text" name="restname" placeholder="Restaurant name..." class="form-username form-control input-lg" id="form-username">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="form-password">Password</label>
                                    <input type="text" name="password" placeholder="Password..." class="form-password form-control input-lg" id="form-password">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="form-address">Address</label>
                                    <input type="text" name="address" placeholder="Address..." class="form-address form-control input-lg" id="form-address">
                                </div>
                                <div class="form-group input-group">
                                    <label class="sr-only" for="form-minorder">First Name</label>
                                    <input type="text" name="minorder" placeholder="Minimum order..." class="form-minorder form-control input-lg" id="form-minorder">
                                    <span class="input-group-addon" style="visibility: hidden;"></span>
                                    <label class="sr-only" for="form-deliveryfee">Last Name</label>
                                    <input type="text" name="delivfee" placeholder="Delivery fee..." class="form-delivfee form-control input-lg" id="form-delivfee">
                                    <span class="input-group-addon" style="visibility: hidden;"></span>
                                    <label class="sr-only" for="form-categpry">Category</label>
                                    <input type="text" name="category" placeholder="Category..." class="form-category form-control input-lg" id="form-category">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="form-address">Phone Number</label>
                                    <input type="text" name="phonenum" placeholder="Phone Number..." class="form-phonenum form-control input-lg" id="form-phonenum">
                                </div>
                                <button type="submit" class="btn buttonColor" value="Submit" id="rsubmit">Register</button>
                            </form>
                        </div>
                    </div>
                    <p style="color: white; padding-top: 15px;">--------------- Already have an account? ---------------</p>
                    <a href="login.jsp"<button type="button" class="btn buttonColor">Login</button></a>
                        or
                    <a href="register.jsp"<button type="button" class="btn buttonColor">Are You a Customer?</button></a>
                </div>
            </div>
        </div>
    </body>
</html>
