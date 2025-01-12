<%-- 
    Document   : Register
    Created on : 14 Oct, 2024, 8:37:55 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body bgcolor="cyan">  
        <a href="Logout.jsp">Sing Out</a> 
        <% 
                String name = (String) session.getAttribute("name"); 
                    if(name==null)
                    {
                        response.sendRedirect("hospitalregister.html");
                    }
        %>
       <H1>Your Hospital ( <%=name%> )</H1>
        <H2>Register successful..</H2>
    </body>
</html>