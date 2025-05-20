package com.java.jsp.servlet;

import com.java.jsp.dto.donationDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/donation")
public class Donation extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String name=req.getParameter("name");
        String contact=req.getParameter("contact");
        long l_contact=0;
        if(contact!=null){
            l_contact=Long.parseLong(contact);
        }

        String amount=req.getParameter("amount");
        long l_amount=0;
        if(amount!=null){
            l_amount=Long.parseLong(amount);
        }

        donationDto donationDto=new donationDto();
        donationDto.setName(name);
        donationDto.setL_contact(l_contact);
        donationDto.setL_amount(l_amount);



        RequestDispatcher requestDispatcher=req.getRequestDispatcher("donationSuccess.jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute("donationDto",donationDto);
        requestDispatcher.forward(req,resp);


    }
}
