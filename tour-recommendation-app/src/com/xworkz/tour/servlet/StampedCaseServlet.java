package com.xworkz.tour.servlet;

import com.xworkz.tour.servlet.dto.StampedCaseDto;
import com.xworkz.tour.servlet.service.StampedCaseService;
import com.xworkz.tour.servlet.service.StampedCaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/case",loadOnStartup = 1)
public class StampedCaseServlet extends HttpServlet {
    public void stamped(){

        System.out.println("Stamped Case created by TomCat");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String event = req.getParameter("event");
        String noOfDeaths = req.getParameter("noOfDeaths");
        String noOFInjuries = req.getParameter("noOfInjuries");
        String location = req.getParameter("location");

        StampedCaseDto stampedCaseDto = new StampedCaseDto();
        stampedCaseDto.setEvent(event);
        stampedCaseDto.setNoOfDeaths(noOfDeaths);
        stampedCaseDto.setNoOfInjuries(noOFInjuries);
        stampedCaseDto.setLocation(location);

        StampedCaseService stampedCaseService = new StampedCaseServiceImpl();
        stampedCaseService.save(stampedCaseDto);


    }
}