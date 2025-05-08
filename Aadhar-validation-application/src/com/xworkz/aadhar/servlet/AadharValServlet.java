package com.xworkz.aadhar.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/submit")
public class AadharValServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("AadharServlet is Running ");
        String aadhar = servletRequest.getParameter("aadhar");
        String name = servletRequest.getParameter("name");
        System.out.println(name + " " + aadhar);

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println(name+"Thanks for give aadhar validation");
    }
}
