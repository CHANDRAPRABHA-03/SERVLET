package com.xworkz.contact.servlet;


import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/click")
public class ContactServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running appointment servlet!!");
        String fname = servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");
        String message = servletRequest.getParameter("message");
        String email = servletRequest.getParameter("email");

        servletResponse.setContentType("text/html");
        PrintWriter Writer = servletResponse.getWriter();
        Writer.println("<h1>Your Contact Details</h1>");
        Writer.println("First Name :"+fname+"<br>");
        Writer.println("Last Name :"+lname +"<br>");
        Writer.println("Email :"+email+"<br>");
        Writer.println("Message :"+message);

    }
}
