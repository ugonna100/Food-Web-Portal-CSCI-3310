<%-- 
    Document   : register
    Created on : Nov 27, 2016, 2:07:51 PM
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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
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
                                <p>Enter your registration information</p>
                            </div>
                            <div class="right" style="margin-top: 10px;">
                                <i class="fa fa-lock"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            <form action="RegisterCustomerServlet" method="post">
                                <div class="form-group">
                                    <label class="sr-only" for="form-username">Username</label>
                                    <input type="text" name="username" placeholder="Username..." class="form-username form-control input-lg" id="form-username">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="form-email">Email</label>
                                    <input type="text" name="email" placeholder="Email..." class="form-username form-control input-lg" id="form-email">
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
                                    <label class="sr-only" for="form-fname">First Name</label>
                                    <input type="text" name="fname" placeholder="First name..." class="form-Fname form-control input-lg" id="form-Fname">
                                    <span class="input-group-addon" style="visibility: hidden;"></span>
                                    <label class="sr-only" for="form-lname">Last Name</label>
                                    <input type="text" name="lname" placeholder="Last name..." class="form-Lname form-control input-lg" id="form-Lname">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="form-phonenum">Phone Number</label>
                                    <input type="text" name="phonenum" placeholder="Phone Number..." class="form-phonenum form-control input-lg" id="form-phonenum">
                                </div>
                                <button type="submit" class="btn buttonColor" value="Submit" id="rsubmit">Register</button>
                            </form>
                        </div>
                    </div>
                    <p style="color: white; padding-top: 15px;">--------------- Already have an account? ---------------</p>
                    <a href="login.jsp"<button type="button" class="btn buttonColor">Login</button></a>
                        or
                    <a href="restRegister.jsp"<button type="button" class="btn buttonColor">Are You a Restaurant?</button></a>
                </div>
            </div>
        </div>
    </body>
</html>
