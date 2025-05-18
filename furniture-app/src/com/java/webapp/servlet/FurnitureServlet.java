package com.java.webapp.servlet;

import com.java.webapp.dto.Furnituredto;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/furniture" ,loadOnStartup=1)
public class FurnitureServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String productNumber=req.getParameter("productNumber");
        String brand=req.getParameter("brand");
        String material=req.getParameter("material");
        String size=req.getParameter("size");

        Furnituredto furnituredto=new Furnituredto();
        furnituredto.setProductNumber(productNumber);
        furnituredto.setBrand(brand);
        furnituredto.setMaterial(material);
        furnituredto.setSize(size);

        RequestDispatcher requestDispatcher=req.getRequestDispatcher("furnitureSuccess.jsp");
        req.setAttribute("message","Information");
        req.setAttribute("furnituredto",furnituredto);

        requestDispatcher.forward(req,resp);



    }
}
