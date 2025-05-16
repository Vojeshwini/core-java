package com.java.webapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class License extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String name=req.getParameter("name");
        String contact=req.getParameter("contact");

        long n_contact=0;
        if(contact!=null){
            n_contact=Long.parseLong(contact);
        }

        String age=req.getParameter("age");
        double n_age=0;
        if(age!=null){
            n_age=Double.parseDouble(age);
        }
        String type=req.getParameter("type");

        System.out.println("forwording to jsp");

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("licenseSuccess.jsp");
        requestDispatcher.forward(req,resp);
    }
}
