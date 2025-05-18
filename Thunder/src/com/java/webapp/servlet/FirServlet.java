package com.java.webapp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir")
public class FirServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String contact=req.getParameter("contact");
        long n_contact=0;
        if(contact!=null){
            n_contact=Long.parseLong(contact);
        }
        String location=req.getParameter("location");
        String details=req.getParameter("details");

        req.setAttribute("message","Save Success");
        req.setAttribute("name",name);
        req.setAttribute("n_contact",n_contact);
        req.setAttribute("location",location);
        req.setAttribute("details",details);


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("firSuccess.jsp");
        requestDispatcher.forward(req,resp);

    }
}
