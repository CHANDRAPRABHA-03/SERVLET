package com.xworkz.feedback.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/submit")
public class FeedbackServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Server is Running");
        String name = servletRequest.getParameter("name");
        String email = servletRequest.getParameter("email");
        String number = servletRequest.getParameter("number");
        String feedback = servletRequest.getParameter("feedback");
        System.out.println("name:"+name+" email:"+email+" number:"+number+" feedback:"+feedback);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println(name+"Thanks for submitting");
    }

}
