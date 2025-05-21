package com.java.jsp.servlet;

import com.java.jsp.dto.LaboratoryDto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/laboratory")
public class Laboratory extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String name=req.getParameter("name");


        String semester=req.getParameter("semester");

        String lab=req.getParameter("lab");
        String details=req.getParameter("details");
      LaboratoryDto laboratoryDto=new LaboratoryDto();
      laboratoryDto.setName(name);
      laboratoryDto.setSemester(semester);
      laboratoryDto.setLab(lab);
      laboratoryDto.setDetails(details);


        RequestDispatcher requestDispatcher=req.getRequestDispatcher("LaboratorySuccess.jsp");
        req.setAttribute("message","Save Success");
        req.setAttribute("laboratoryDto",laboratoryDto);



        requestDispatcher.forward(req,resp);




    }
}
