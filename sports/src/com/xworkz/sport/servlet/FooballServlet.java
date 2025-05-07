package com.xworkz.sport.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class FooballServlet extends GenericServlet {
    public FooballServlet(){
        System.out.println("FooballServlet is created by Servlet");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Fooball service is running");
    }
}
