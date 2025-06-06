package com.java.aeroplane.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/send",loadOnStartup = 1)
public class AeroplaneAction extends GenericServlet {

    public AeroplaneAction(){
        System.out.println("running the aeroplane");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running the service");
    }
}

