package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import db.DBconnector;
import java.sql.Statement;

public final class Location_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>home Page</title> \n");
      out.write("        ");


            String pin = (String) session.getAttribute("pin");
                    
            String Address = "";
            
            int num1 = Integer.parseInt(pin);
            num1= (num1);
            int num2 =  (num1); 
            
            

            Statement st = DBconnector.getStatement();

            try {
                String query = "SELECT Address from hospital where pin BETWEEN'"+num2+"' AND '"+num1+"'";
                ResultSet rs = st.executeQuery(query);

                
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"gray\">   \n");
      out.write("        <div style=\"background:white;width:90%;max-width:600px;margin: 100px auto 0;border-radius: 10px;padding: 60px;\">\n");
      out.write("\n");
      out.write("            <a href=\"Ulogout.jsp\">Sing Out</a> \n");
      out.write("\n");
      out.write("            <H1>");
      out.print(pin);
      out.write(" You Have entered</H1>\n");
      out.write("            ");
while (rs.next()) {
                    
                    session.setAttribute("pin",pin);
                    
      out.write("\n");
      out.write("            <form action=\"\" method=\"post\" >\n");
      out.write("                <table >  \n");
      out.write("                    <tr>\n");
      out.write("                        <td><h2> Your Test: ");
      out.print(rs.getString("Address"));
      out.write("</h2></Strong></td> \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                </table> \n");
      out.write("                    \n");
      out.write("            </form> \n");
      out.write("                    ");

                }
            } catch (SQLException e) {
                System.out.println(e);
            }

        
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
