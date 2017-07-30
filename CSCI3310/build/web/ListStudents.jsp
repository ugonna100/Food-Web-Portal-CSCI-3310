<%-- 
    Document   : ListStudents
    Created on : Nov 17, 2016, 12:06:52 PM
    Author     : Bakuano
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="<c:url value="style.css" />" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students</title>
    </head>
    <body>
        <h1>Student list</h1>
        <table border="1">
            <thead>
                <th>Email</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Phone Number</th>
            </thead>
            <tbody>
                <c:forEach items="${students}" var="student">
                    <tr>
                        <td>
                            <c:out value="${student.email}" />
                        </td>
                        <td>
                            <c:out value="${student.fname}" />
                        </td>
                        <td>
                            <c:out value="${student.lname}" />
                        </td>
                        <td>
                            <c:out value="${student.phone}" />
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
