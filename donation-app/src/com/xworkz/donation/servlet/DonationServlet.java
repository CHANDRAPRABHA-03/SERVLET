package com.xworkz.donation.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/click")
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running!!");
        String fname = servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");
        String cause = servletRequest.getParameter("cause");
        String amount = servletRequest.getParameter("amount");
        String email = servletRequest.getParameter("email");
        System.out.println("Firstname "+fname);
        System.out.println("Lastname "+lname);
        System.out.println("Cause "+cause);
        System.out.println("Amount "+amount);
        System.out.println("Email "+email);

        System.out.println("Using request dispatcher to forward the req and res to another jsp/servlet");
        //abstraction: Servlet Chaining
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("donation.jsp");
        //jsp->generate servlet->service(servletRequest,servletResponse)==>write HTML;
        requestDispatcher.forward(servletRequest,servletResponse);
        servletResponse.setContentType("text/html");

    }
}
