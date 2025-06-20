package com.xworkz.bdayzoom.servlet;

import com.xworkz.bdayzoom.dto.BirthdayDto;
import com.xworkz.bdayzoom.service.BirthdayService;
import com.xworkz.bdayzoom.service.BirthdayServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

@WebServlet(urlPatterns = {"/Birthday","/FetchBirthdayServlet"},loadOnStartup = 1)
public class BirthdayServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String person_name = req.getParameter("person_name");
        String dates = req.getParameter("event_date");
        LocalDate event_date=null;
        if(dates!=null) {
            event_date = LocalDate.parse(dates);
        }
        String location = req.getParameter("location");
        long contact = Long.parseLong(req.getParameter("contact"));

        String relation = req.getParameter("relation");
        String cake_info = req.getParameter("cake_info");


    BirthdayDto birthdayDto = new BirthdayDto(person_name,event_date,location,contact,relation,cake_info);
        BirthdayService birthdayService= new BirthdayServiceImpl();
        boolean valid=birthdayService.save(birthdayDto);

        if(valid){
            System.out.println("service done successfully");
            req.setAttribute("success","Birthday Details Saved Successfully");
        }
        else{
            System.out.println("not saved");
            req.setAttribute("dto",birthdayDto);
            req.setAttribute("failure","Birthday Details not saved Successfully");
        }
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/Event.jsp");
        requestDispatcher.forward(req,resp);

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running get in BirthdayServlet..");
        String birthdayId= req.getParameter("birthdayId");
        if(birthdayId!=null)
        {
            int id=Integer.parseInt(birthdayId);
            System.out.println("search id :"+id);
            BirthdayService birthdayService=new BirthdayServiceImpl();
            Optional<BirthdayDto> optionalBirthdayDto= birthdayService.findById(id);
            if(optionalBirthdayDto.isPresent())
            {
                BirthdayDto birthdayDto=optionalBirthdayDto.get();
                System.out.println("Birthday data is found :"+birthdayDto);
                req.setAttribute("dto", birthdayDto);

            }
            else{
                System.out.println("Birthday data is not found for id :"+id);
                req.setAttribute("failure", "Birthday data not found for ID: " + id);
            }
            RequestDispatcher dispatcher = req.getRequestDispatcher("/Event.jsp");
            dispatcher.forward(req, resp);
        }
    }
}

