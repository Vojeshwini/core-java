package com.java.webapps.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/submit")
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contact=servletRequest.getParameter("contact");

        long n_contact=0;
        if(contact!=null){
            n_contact=Long.parseLong(contact);
        }

        String email=servletRequest.getParameter("email");
        String cause=servletRequest.getParameter("cause");
        String amount=servletRequest.getParameter("amount");
        long n_amount=0;
        if(amount!=null){
            n_amount=Long.parseLong(amount);
        }

        System.out.println("Forwarding to JSP");
        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("donationsuccess.jsp");

        requestDispatcher.forward(servletRequest,servletResponse);
    }
}
