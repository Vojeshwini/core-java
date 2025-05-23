package com.java.webapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/laboratory")
public class Laboratory extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String name=req.getParameter("name");


        String semester=req.getParameter("semester");

        String lab=req.getParameter("lab");
        String details=req.getParameter("details");



        RequestDispatcher requestDispatcher=req.getRequestDispatcher("LaboratorySuccess.jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute("name",name);
        req.setAttribute("semester",semester);
        req.setAttribute("lab",lab);
        req.setAttribute("details",details);


        requestDispatcher.forward(req,resp);




    }
}
