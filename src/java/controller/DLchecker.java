/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.chemistauthentication;

/**
 *
 * @author Lenovo
 */
public class DLchecker extends HttpServlet 
{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Doctorlogin.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

            if (username!=null && password!=null)       
           {
            chemistauthentication a1 = new chemistauthentication();
            boolean Login = a1.islogin(username, password);
            
            if (Login)
            {
               HttpSession session = request.getSession(true);
               session.setAttribute("username",username);
                response.sendRedirect("precscription.html");
            }
            else 
            {
                response.sendRedirect("Doctorlogin.html");
            }
        } 
        else 
        {
            response.sendRedirect("Doctorlogin.html");
        }
    }

}
