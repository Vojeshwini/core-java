package com.appointment.app.java;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/appointment")
public class AppointmentServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String firstName=servletRequest.getParameter("firstName");
        String lastName=servletRequest.getParameter("lastName");
        String email =servletRequest.getParameter("email");
        String age =servletRequest.getParameter("age");

        int n_age=0;
    if(age!=null){
        n_age=Integer.parseInt(age);
    }
        String  address=servletRequest.getParameter("address");
        String gender =servletRequest.getParameter("gender");
        String sickness  =servletRequest.getParameter("sickness");
        String  mobile =servletRequest.getParameter("mobile");
        long n_mobile=0;
        if(mobile!=null){
            n_mobile=Long.parseLong(mobile);
        }

        servletResponse.setContentType("text/html");

        PrintWriter writer=servletResponse.getWriter();
        writer.println("<h1>Appointment Details</h1>");
        writer.println("<h3>FIRST NAME:</h3>"+firstName);
        writer.println("<h3>LAST NAME:</h3>"+lastName);
        writer.println("<h3>EMAIL:</h3>"+email);
        writer.println("<h3>AGE:</h3>"+age);
        writer.println("<h3>ADDRESS:</h3>"+address);
        writer.println("<h3>GENDER:</h3>"+gender);
        writer.println("<h3>SICKNESS</h3>"+sickness);
        writer.println("<h3>MOBILE:</h3>"+mobile);
        writer.println("<h3>Your slot confirmed");







    }
}
