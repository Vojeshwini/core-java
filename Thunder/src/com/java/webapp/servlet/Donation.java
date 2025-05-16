package com.java.webapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Donation extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String name=req.getParameter("name");
        String contact=req.getParameter("contact");
        long l_contact=0;
        if(contact!=null){
            l_contact=Long.parseLong(contact);
        }

        String amount=req.getParameter("amount");
        long l_amount=0;
        if(contact!=null){
            l_amount=Long.parseLong(amount);
        }

        req.setAttribute("message","Save Success");
        req.setAttribute("name",name);
        req.setAttribute("semester",l_contact);
        req.setAttribute("lab",l_amount);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("donationSuccess.jsp");
        requestDispatcher.forward(req,resp);


    }
}
