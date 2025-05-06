package com.java.cricket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/Hockey",loadOnStartup = 1)
public class HockeyAction extends GenericServlet {
    public HockeyAction(){
        System.out.println("running the HockeyAction ");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running the service in the HockeyAction");
    }
}
