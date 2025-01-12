<%-- 
    Document   : Logout
    Created on : 14 Oct, 2024, 8:39:14 PM
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
                response.sendRedirect("hospitalregister.html");

            %>
    </body>
</html>
