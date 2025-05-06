package com.java.cricket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/kabaddi",loadOnStartup=1)
public class KabbadiAction extends GenericServlet {
    public KabbadiAction(){
        System.out.println("running the KabbadiAction");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running the service in the KabbadiAction");
    }
}
