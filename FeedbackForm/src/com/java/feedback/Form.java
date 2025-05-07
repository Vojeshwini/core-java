package com.java.feedback;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class Form extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("feedback is running");

        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String tel = servletRequest.getParameter("Contactnumber");
        String feedback = servletRequest.getParameter("feedback");

        System.out.println(name + " " + email + " " + tel + " " + feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
    }
}