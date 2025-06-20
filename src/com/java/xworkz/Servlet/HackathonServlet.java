package com.java.xworkz.Servlet;

import com.java.xworkz.Dto.HackathonDto;
import com.java.xworkz.constant.DbProperties;
import com.java.xworkz.service.HackathonService;
import com.java.xworkz.service.HackathonServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;
@WebServlet(urlPatterns = {"/submit" ,"/search"},loadOnStartup = 1)
public class HackathonServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String collegeName = req.getParameter("collegeName");
        String teamName = req.getParameter("teamName");
        String totalMembers = req.getParameter("totalMembers");
        int ntotalMembers=0;
        if(totalMembers!=null){
            ntotalMembers=Integer.parseInt(totalMembers);
        }
        String teamLeader = req.getParameter("teamLeader");
        String contact = req.getParameter("contact");
        long ncontact = 0;
        if (contact != null) {
            ncontact = Long.parseLong(contact);
        }
        String email = req.getParameter("email");

         String createdBy = DbProperties.VOJESHWINI.toString();
         Timestamp createdTime = Timestamp.valueOf(LocalDateTime.now());

        HackathonDto hackathonDto = new HackathonDto(collegeName, teamName, ntotalMembers, teamLeader, ncontact,email,createdBy,createdTime);
        HackathonService hackathonService = new HackathonServiceImpl();
        boolean saved = hackathonService.save(hackathonDto);
        RequestDispatcher requestDispatcher;
        if (saved) {
            requestDispatcher = req.getRequestDispatcher("Hackathon.jsp");

            req.setAttribute("message", "Details");
            req.setAttribute("hackathonDto", hackathonDto);
            req.setAttribute("success", "Saved succesfully");
        } else {
            requestDispatcher = req.getRequestDispatcher("Hackathon.jsp");
            req.setAttribute("message", "Details are incorrect");
            req.setAttribute("dto", hackathonDto);
            req.setAttribute("Notsuccess", "Details not saved");

        }
        requestDispatcher.forward(req, resp);

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running get in hackathonServlet..");
        String hackathonId= req.getParameter("id");

        if(hackathonId!=null && !hackathonId.trim().isEmpty()) {
           int id = Integer.parseInt(hackathonId);

            System.out.println("search id :"+id);
            HackathonService hackathonService=new HackathonServiceImpl();
            Optional<HackathonDto> optionalHackathonDTO= hackathonService.findById(id);
            if(optionalHackathonDTO.isPresent())
            {
                HackathonDto hackathonDto=optionalHackathonDTO.get();
                System.out.println("Hackathon data is found :"+hackathonDto);
                req.setAttribute("dto", hackathonDto);
                req.setAttribute("message", "Details of Hackathon Participants ");
                req.setAttribute("column1", "College name :");
                req.setAttribute("column2", "Team name :");
                req.setAttribute("column3", "Total members in team :");

                req.setAttribute("column4", "Team leader name :");
                req.setAttribute("column5", "Phone number :");
                req.setAttribute("column6", "Email-address :");




                req.setAttribute("hackathonDto", hackathonDto);
            }
            else{
                System.out.println("Hackathon data is not found for id :"+id);
                req.setAttribute("failure", "Hackathon data not found for ID: " + id);
            }
            RequestDispatcher dispatcher = req.getRequestDispatcher("hackathonSearch.jsp");
            dispatcher.forward(req, resp);
        }
    }

    }

