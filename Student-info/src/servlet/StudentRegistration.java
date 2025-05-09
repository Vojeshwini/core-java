package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class StudentRegistration extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contactNumber=servletRequest.getParameter("contactNumber");
        long c_number=0;
        if(contactNumber!=null){
            c_number=Long.parseLong(contactNumber);
        }
        String course=servletRequest.getParameter("course");
        String selectCollege=servletRequest.getParameter("selectCollege");


        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();


        writer.println("<h1>THANK YOU FOR Registering!!!</h1>");
        writer.println("<h1>STATUS</h1>");
        writer.println("<h3>Name:</h3>" + name);
        writer.println("<h3>Email:</h3>" + email);

        writer.println("<h3>Contact Number:</h3>" + contactNumber);
        writer.println("<h3>Course:</h3>" + course);
        writer.println("<h3>Selected Course:</h3>" + selectCollege);
        writer.println("<h1>HAVE A NICE DAY</h1>");






    }
}
