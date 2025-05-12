package com.appointment.app.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/contact")
public class ContactServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String firstName=servletRequest.getParameter("firstName");
        String lastName=servletRequest.getParameter("lastName");
        String message=servletRequest.getParameter("message");
        String email=servletRequest.getParameter("email");

        PrintWriter writer=servletResponse.getWriter();
        writer.println("<h1>CONTACT DETAILS</h1>");
        writer.println("<h3>FIRST NAME:<h3>"+firstName);
        writer.println("<h3>LAST NAME:<h3>"+lastName);
        writer.println("<h3>MESSAGE:<h3>"+message);
        writer.println("<h3>EMAIL:<h3>"+email);



    }
}
