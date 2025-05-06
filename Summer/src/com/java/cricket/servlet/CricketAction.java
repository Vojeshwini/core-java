package com.java.cricket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/cricket",loadOnStartup = 1)
public class CricketAction extends GenericServlet {

    public CricketAction(){
        System.out.println("running the CricketAction in the servlet");
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running the service in the servlet");
    }
}
