<%-- 
    Document   : chemistreport
    Created on : 14 Sep, 2024, 1:26:46 AM
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
        <%  String name = "", age = "", prescriptions = "";

            Statement st = DBconnector.getStatement();

            try {
                String query = "SELECT * from prescription";
                ResultSet rs = st.executeQuery(query);

                %>
    </head>
    <body bgcolor="gray">   
        <div style="background:white;width:90%;max-width:600px;margin: 100px auto 0;border-radius: 10px;padding: 60px;">

            <a href="ChemistLogin.html">Sing out</a><br><br><br>

            
            <%while (rs.next()) {
                    
                   
                    %>
            <form action="" method="post" >
                <table >  

                    <tr>
                        <td><h2> Patient Name: <%=rs.getString("name")%></h2></Strong></td> 
                    </tr>
                    <tr> 
                        <td><Strong><h3> Patient Age:<%=rs.getString("age")%></h3></Strong></td> 
                    </tr> 
                    <tr> 
                        <td><Strong><h3> prescription: <%=rs.getString("prescriptions")%></h3></Strong></td> 
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
