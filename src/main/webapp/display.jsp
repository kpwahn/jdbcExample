<%-- 
    Document   : display
    Created on : Jun 29, 2015, 3:57:44 PM
    Author     : Kendall
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Your Family</h1>
       
        <c:forEach var="person" items="${people}">
            <a href="Details?id=${person.id}" > ${person.toString()} </a> <br/>
        </c:forEach>
    </body>
</html>
