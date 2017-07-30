<%-- 
    Document   : login
    Created on : Nov 22, 2016, 11:43:49 AM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body class="login font2">
        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2" style="margin-top:1%;">
                    <img src="logo.png">
                </div>
            </div>
            <div class="row">
                <div class="col-sm-4 col-sm-offset-4">
                    <div class="form-box">
                        <div class="form-top">
                            <div class="left">
                                <h3 style="padding-bottom: 15px;">Sign in</h3>
                                <p>Enter your username and password to log in:</p>
                            </div>
                            <div class="right" style="margin-top: 10px;">
                                <i class="fa fa-lock"></i>
                            </div>
                        </div>
                        <div class="form-bottom">
                            <form action="ValidateStudentServlet" method="post">
                                <div class="form-group">
                                    <label class="sr-only" for="form-username">Username</label>
                                    <input type="text" name="username" placeholder="Username..." class="form-username form-control input-lg" id="form-username">
                                </div>
                                <div class="form-group">
                                    <label class="sr-only" for="form-password">Password</label>
                                    <input type="text" name="password" placeholder="Password..." class="form-password form-control input-lg" id="form-password">
                                </div>
                                <button type="submit" class="btn buttonColor" value="Submit" id="rsubmit">Sign in</button>
                            </form>
                        </div>
                    </div>
                    <p style="color: white; padding-top: 15px;">--------------- New to EbolaDragon? ---------------</p>
                    <a href="register.jsp"<button type="button" class="btn buttonColor">Create your account</button></a>
                </div>
            </div>
        </div>
    </body>
</html>
