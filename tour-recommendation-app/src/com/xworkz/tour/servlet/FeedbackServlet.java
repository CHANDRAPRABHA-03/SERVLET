package com.xworkz.tour.servlet;

import com.xworkz.tour.servlet.dto.FeedbackDto;
import com.xworkz.tour.servlet.repository.FeedbackRepo;
import com.xworkz.tour.servlet.repository.FeedbackRepoImpl;
import com.xworkz.tour.servlet.service.FeedbackService;
import com.xworkz.tour.servlet.service.FeedbackServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/submit")
public class FeedbackServlet extends HttpServlet {

    public FeedbackServlet(){
        System.out.println("FeedbackServlet created by tomcat");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String contact=req.getParameter("contact");
        String feedback=req.getParameter("feedback");

        FeedbackDto feedbackDto=new FeedbackDto();
        feedbackDto.setName(name);
        feedbackDto.setEmail(email);
        feedbackDto.setContact(contact);
        feedbackDto.setFeedback(feedback);

        FeedbackService feedbackService=new FeedbackServiceImpl();
        boolean save = feedbackService.save(feedbackDto);
        if(save){
            System.out.println("Saved");
            FeedbackRepo feedbackRepo=new FeedbackRepoImpl();
            feedbackRepo.persist(feedbackDto);

        }
        else{
            System.out.println("null");

        }

    }
}