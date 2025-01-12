/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.prescriptionverify;

/**
 *
 * @author anubh
 */
public class prescription extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("precscription.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String prescription = request.getParameter("prescription");
        

        prescriptionverify aq = new prescriptionverify();
        boolean Login = aq.Addon(name,age,prescription);
        if (Login) 
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("name",name);

            response.sendRedirect("drsingout.jsp");
        } 
        else
        {
            response.sendRedirect("precscription.html");
        }
    }


}
