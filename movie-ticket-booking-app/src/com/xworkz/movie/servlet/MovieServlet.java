package com.xworkz.movie.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class MovieServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running...");

        String name = servletRequest.getParameter("name");
        String number = servletRequest.getParameter("number");
        long c_number = 0L;
        if(number!= null &&  number!=""){
            c_number = Long.parseLong(number);
        }

        String movieName = servletRequest.getParameter("movieName");

        String tickets = servletRequest.getParameter("tickets");
        int t_ticket = 0;
        if(tickets!= null && tickets!=""){
            t_ticket = Integer.parseInt(tickets);
        }
        String ticketCost = servletRequest.getParameter("ticketCost");
        int t_cost = 0;
        if(ticketCost!=null && ticketCost!=""){
            t_cost = Integer.parseInt(ticketCost);
        }
        int amount_payable = t_cost*t_ticket;
        servletResponse.setContentType("text/html");
        PrintWriter writer =servletResponse.getWriter();
        writer.println("<h1>Thank You For Booking</h1>");
        writer.println("<h1>Payable amount</h1>"+amount_payable);

    }
}
