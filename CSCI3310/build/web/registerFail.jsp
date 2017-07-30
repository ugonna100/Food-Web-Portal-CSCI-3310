<%-- 
    Document   : registered
    Created on : Nov 28, 2016, 8:30:45 AM
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
                                <h3 style="padding-bottom: 15px;">Err</h3>
                                <p>That account is taken!</p>
                            </div>
                            <div class="right">
                                <i class="fa fa-lock"></i>
                            </div>
                        </div>
                        <div class="form-bottom text-center">
                            <h2>Do you already have an account?</h2>
                            <a href="login.jsp"<button type="button" class="btn buttonColor">Login</button></a>
                            or
                            <a href="register.jsp"<button type="button" class="btn buttonColor">Try again</button></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
