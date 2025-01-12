<%-- 
    Document   : drsingout
    Created on : 15 Sep, 2024, 1:43:48 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            session.invalidate();
            response.sendRedirect("precscription.html");

        %>
    </body>
</html>
