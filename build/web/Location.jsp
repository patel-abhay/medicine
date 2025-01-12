<%-- 
    Document   : Location
    Created on : 16 Oct, 2024, 7:39:38 PM
    Author     : Lenovo
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="db.DBconnector"%>
<%@page import="java.sql.Statement"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home Page</title> 
        <%

            String pin = (String) session.getAttribute("pin");
                    
            String Address = "";
            
            int num1 = Integer.parseInt(pin);
            num1= (num1);
            int num2 =  (num1); 
            
            

            Statement st = DBconnector.getStatement();

            try {
                String query = "SELECT Address from hospital where pin BETWEEN'"+num2+"' AND '"+num1+"'";
                ResultSet rs = st.executeQuery(query);

                %>
    </head>
    <body bgcolor="gray">   
        <div style="background:white;width:90%;max-width:600px;margin: 100px auto 0;border-radius: 10px;padding: 60px;">

            <a href="Ulogout.jsp">Sing Out</a> 

            <H1><%=pin%> You Have entered</H1>
            <%while (rs.next()) {
                    
                    session.setAttribute("pin",pin);
                    %>
            <form action="" method="post" >
                <table >  
                    <tr>
                        <td><h2> Your Test: <%=rs.getString("Address")%></h2></Strong></td> 
                    </tr>
                    
                </table> 
                    
            </form> 
                    <%
                }
            } catch (SQLException e) {
                System.out.println(e);
            }

        %>
        </div>
    </body>
</html>

</body>
</html>