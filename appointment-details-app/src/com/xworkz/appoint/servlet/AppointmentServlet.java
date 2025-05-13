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

        System.out.println("Running appointment servlet");
        String firstname = servletRequest.getParameter("firstname");
        String lastname = servletRequest.getParameter("lastname");
        String message = servletRequest.getParameter("message");
        String mail = servletRequest.getParameter("mail");

        servletResponse.setContentType("text/html");
        PrintWriter Writer = servletResponse.getWriter();
        Writer.println("<h1>Your Contact Details</h1>");
        Writer.println("First Name :"+firstname+"<br>");
        Writer.println("Last Name :"+lastname +"<br>");
        Writer.println("Email :"+mail+"<br>");
        Writer.println("Message :"+message);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<h1>Details of your Appointment</h1>");
        writer.println("First Name :"+fname+"<br>");
        writer.println("Last Name :"+lname +"<br>");
        writer.println("Email :"+email+"<br>");
        writer.println("age :"+age+"<br>");
        writer.println("Address :"+address+"<br>");
        writer.println("Gender :"+gender+"<br>");
        writer.println("Sickness :"+sickness+"<br>");
        writer.println("Mobile Number :"+mobileno+"<br>");

    }
}
