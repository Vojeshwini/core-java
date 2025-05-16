package com.java.webapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Laboratory extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String name=req.getParameter("name");


        String semester=req.getParameter("semester");
        double n_semester=0;
        if(semester!=null){
            n_semester=Double.parseDouble(semester);
        }
        String lab=req.getParameter("lab");
        String details=req.getParameter("details");

        req.setAttribute("message","Save Success");
        req.setAttribute("name",name);
        req.setAttribute("semester",n_semester);
        req.setAttribute("lab",lab);
        req.setAttribute("details",details);



        RequestDispatcher requestDispatcher=req.getRequestDispatcher("LaboratorySuccess.jsp");
        requestDispatcher.forward(req,resp);




    }
}
