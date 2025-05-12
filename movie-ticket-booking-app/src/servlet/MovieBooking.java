package servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class MovieBooking extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String contactNumber=servletRequest.getParameter("contactNumber");
        long c_number=0;
        if(contactNumber!=null){
            c_number=Long.parseLong(contactNumber);
        }
        String movieName=servletRequest.getParameter("movieName");
        String location=servletRequest.getParameter("location");
        String seat=servletRequest.getParameter("seat");

        String price=servletRequest.getParameter("price");
        int amount=0;
        if(price!=null){
            amount=Integer.parseInt(price);
        }

        String ticket=servletRequest.getParameter("ticket");
        int totalTicket=0;
        if(ticket!=null){
            totalTicket=Integer.parseInt(ticket);
        }

        int PayableAmout=totalTicket*amount;

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();

        writer.println("<html>");
        writer.println("<head><title>Booking Status</title></head>");
        writer.println("<body style='background-color:lightblue;'>"); // You can change the color here

        writer.println("<h1>THANK YOU FOR BOOKING!!!</h1>");
        writer.println("<h1>STATUS</h1>");
        writer.println("<h3>Name:</h3>" + name);
        writer.println("<h3>Movie Name:</h3>" + movieName);
        writer.println("<h3>Total Amount:</h3>"+ PayableAmout);

        writer.println("</body>");
        writer.println("</html>");




    }
}
