package com.xworkz.sport.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns ="/Bad")
public class BadmintonServlet extends GenericServlet {
    public BadmintonServlet(){
        System.out.println("BadmintonServlet is created by Servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Badminton Service is running");
    }
}
