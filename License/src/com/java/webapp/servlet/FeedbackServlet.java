package com.java.webapp.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/feedback")
public class FeedbackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contact=servletRequest.getParameter("contact");

        long n_contact=0;
        if(contact!=null){
            n_contact=Long.parseLong(contact);
        }
        String message=servletRequest.getParameter("message");

        System.out.println("forwarding the feedback to jsp");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("thank.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);



    }
}
