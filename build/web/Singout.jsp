<%-- 
    Document   : Singout
    Created on : 14 Sep, 2024, 1:53:34 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Sing out Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("ChemistLogin.html");

        %>
    </body>
</html>
