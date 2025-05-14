package com.java.webapp.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/laboratory")
public class Laboratory extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String contact=servletRequest.getParameter("contact");
        long l_contact=0;
        if(contact!=null){
            l_contact=Long.parseLong(contact);
        }

        String semester=servletRequest.getParameter("semester");
        double n_semester=0;
        if(semester!=null){
            n_semester=Double.parseDouble(semester);
        }
        String labname=servletRequest.getParameter("labname");

        RequestDispatcher requestDispatcher=servletRequest.getRequestDispatcher("thank.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);



    }
}
