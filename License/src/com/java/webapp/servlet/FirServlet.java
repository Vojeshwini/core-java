package com.java.webapp.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir")
public class FirServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contact=servletRequest.getParameter("contact");
        long n_contact=0;
        if(contact!=null){
            n_contact=Long.parseLong(contact);
        }
        String location=servletRequest.getParameter("location");
        String details=servletRequest.getParameter("details");


        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("thank.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);


    }
}
