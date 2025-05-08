package com.xworkz.tour.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class TourServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running......");
        String name = servletRequest.getParameter("name");
        String number = servletRequest.getParameter("number");
        long ph_number = 0L;
        if(number!= null && number!=""){
            ph_number = Long.parseLong(number);
        }

        String placeName = servletRequest.getParameter("placeName");
        String aadhar = servletRequest.getParameter("aadhar");
        long a_no =0;
        if(aadhar!=null && aadhar!=""){
            a_no = Long.parseLong(aadhar);
        }

        String person = servletRequest.getParameter("person");
        int p_son = 0;
        if(person!= null && person!=""){
            p_son = Integer.parseInt(person);
        }

        String Cost = servletRequest.getParameter("Cost");
        int p_cost = 0;
        if(Cost!=null && Cost!=""){
            p_cost = Integer.parseInt(Cost);
        }
        int amount_payable = p_son*p_cost;
        servletResponse.setContentType("text/html");
        PrintWriter writer =servletResponse.getWriter();
        writer.println("<h1>Thank You For Booking</h1>");
        writer.println("<h1>Payable amount</h1>"+amount_payable);

    }
}

