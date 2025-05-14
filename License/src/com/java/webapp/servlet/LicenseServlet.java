package com.java.webapp.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/license")
public class LicenseServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contact=servletRequest.getParameter("contact");

        long n_contact=0;
        if(contact!=null){
            n_contact=Long.parseLong(contact);
        }

        String age=servletRequest.getParameter("age");
        double n_age=0;
        if(age!=null){
            n_age=Double.parseDouble(age);
        }
        String type=servletRequest.getParameter("license");

        System.out.println("forwording to jsp");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("thank.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);






    }
}
