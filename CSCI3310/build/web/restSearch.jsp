<%-- 
    Document   : restSearch
    Created on : Nov 30, 2016, 2:49:30 PM
    Author     : Bakuano
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Register Search</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="https://fonts.googleapis.com/css?family=Oswald|Slabo+27px|Vollkorn|Yellowtail" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Bungee+Inline|Exo" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<link rel="stylesheet" href="style.css">
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
                                    <h3 style="padding-bottom: 15px;">Search</h3>
                                    <p>Enter a restaurant name or category of food:</p>
                                </div>
                                <div class="right" style="margin-top: 10px;">
                                    <i class="fa fa-search-plus"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                <form action="SearchRestaurantServlet" method="post" class="text-center">
                                    <input type="radio" name="decision" value="name" checked> Name 
                                    <input type="radio" name="decision" value="category" style="margin-left: 20px; margin-bottom: 20px;"> Category<br>
                                    <input style="color: black; font-size: 1.5em; margin-bottom: 20px;" class="searchBar" id="searchBar" type="text" name="searchBar" placeholder="Category or Name...">
                                    <button type="submit" class="btn buttonColor" value="Submit" id="rsubmit">Search</button>
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