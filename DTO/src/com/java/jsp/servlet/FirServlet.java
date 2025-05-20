package com.java.jsp.servlet;

import com.java.jsp.dto.FirDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/fir")
public class FirServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String contact=req.getParameter("contact");
        long n_contact=0;
        if(contact!=null){
            n_contact=Long.parseLong(contact);
        }
        String location=req.getParameter("location");
        String details=req.getParameter("details");


        FirDto firDto=new FirDto();
        firDto.setName(name);
        firDto.setN_contact(n_contact);
        firDto.setDetails(details);
        firDto.setLocation(location);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("firSuccess.jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute("firDto",firDto);


        requestDispatcher.forward(req,resp);

    }
}
