package com.xworkz.donation.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
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
        servletResponse.setContentType("text/html");
        PrintWriter writer =servletResponse.getWriter();
        writer.println("<h1>Thanks for Donate<h1>");
    }
}
