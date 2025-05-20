package com.java.jsp.servlet;

import com.java.jsp.dto.FeebackDto;
import com.sun.javaws.exceptions.OfflineLaunchException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback")
public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);

        String name=req.getParameter("name");
        String contact=req.getParameter("contact");

        long n_contact=0;
        if(contact!=null){
            n_contact=Long.parseLong(contact);
        }
        String message=req.getParameter("message");

        System.out.println("forwarding the feedback to jsp");

        FeebackDto feebackDto=new FeebackDto();
        feebackDto.setName(name);
        feebackDto.setN_contact(n_contact);
        feebackDto.setMessage(message);


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("feedbackSuccess.jsp");
        req.setAttribute("heading","Save Success");
        req.setAttribute("feedbackDto",feebackDto);
        requestDispatcher.forward(req,resp);


    }





}
