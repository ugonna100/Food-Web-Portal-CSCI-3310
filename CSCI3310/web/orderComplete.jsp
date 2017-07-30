<%-- 
    Document   : orderComplete
    Created on : Dec 1, 2016, 10:51:20 AM
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
                    <div class="col-sm-4 col-sm-offset-4">
                        <div class="form-box">
                            <div class="form-top">
                                <div class="left">
                                    <h3 style="padding-bottom: 15px;">Complete</h3>
                                    <p>Head back to the dashboard or chill right here</p>
                                </div>
                                <div class="right" style="margin-top: 10px;">
                                    <i class="fa fa-search-plus"></i>
                                </div>
                            </div>
                            <div class="form-bottom text-center">
                                <h2>Order complete!</h2>
                                <p>Your food is on its way.</p>
                                <a href="dashboard.html" <button type="submit" class="btn buttonColor"><i class="fa fa-home"></i> Home</button></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
