package com.java.cricket.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/Baseball",loadOnStartup = 1)
public class BaseBallAction extends GenericServlet {
    public BaseBallAction(){
        System.out.println("running the baseBallAction");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("running the service in the baseBallAction");
    }
}
