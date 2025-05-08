import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/adhaar")

public class aadhar extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Adhaar is running");
        String number=servletRequest.getParameter("number");
        System.out.println(number);
        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println(number+"Thank you for validation");

    }
}