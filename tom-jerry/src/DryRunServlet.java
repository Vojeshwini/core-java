import javax.jws.WebService;
import javax.servlet.*;

public class DryRunServlet {
   @WebService()
    public DryRunServlet(){
       System.out.println("running the dryrunServlet");

   }


   @Override
    public service(sevletRequest request, serveletResponse response){
        System.out.println("running the service ");

    }
}
