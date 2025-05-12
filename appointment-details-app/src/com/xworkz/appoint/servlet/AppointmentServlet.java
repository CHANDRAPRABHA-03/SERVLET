package com.xworkz.appoint.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/click")
public class AppointmentServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running appointment servlet");
        String fname = servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");
        String email = servletRequest.getParameter("email");
        String age = servletRequest.getParameter("age");
        String address = servletRequest.getParameter("address");
        String gender = servletRequest.getParameter("gender");
        String sickness = servletRequest.getParameter("sickness");
        String mobileno = servletRequest.getParameter("mobileno");

        servletResponse.setContentType("text/html");
        PrintWriter Writer = servletResponse.getWriter();
        Writer.println("<h1>Details of your Appointment</h1>");
        Writer.println("First Name :"+fname+"<br>");
        Writer.println("Last Name :"+lname +"<br>");
        Writer.println("Email :"+email+"<br>");
        Writer.println("age :"+age+"<br>");
        Writer.println("Address :"+address+"<br>");
        Writer.println("Gender :"+gender+"<br>");
        Writer.println("Sickness :"+sickness+"<br>");
        Writer.println("Mobile Number :"+mobileno+"<br>");

    }
}
