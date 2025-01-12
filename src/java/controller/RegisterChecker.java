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
import model.Registerviewer;

/**
 *
 * @author anubh
 */
public class RegisterChecker extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  
    {
       response.sendRedirect("hospitalregister.html");
    } 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  
    {
       String name = request.getParameter("name");
       String pin = request.getParameter("pin"); 
       String  Address = request.getParameter("Address");
       
     Registerviewer rv = new Registerviewer();
       boolean Login = rv.isRegister(name,pin,Address);
      if(Login) 
      {
          HttpSession session = request.getSession(true);
           session.setAttribute("name",name);
          
           response.sendRedirect("Register.jsp"); 
         /* RequestDispatcher rd = request.getRequestDispatcher("Register.jsp");
           rd.forward(request, response);*/
       } 
       else
       {
           response.sendRedirect("hospitalregister.html");
       }
     }
}
