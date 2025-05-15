package com.xworkz.chain.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/fire")
public class FirServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running FireServlet");
        String name = servletRequest.getParameter("name");
        String mail = servletRequest.getParameter("email");
        String mobile = servletRequest.getParameter("mobile");
        String address = servletRequest.getParameter("address");


        System.out.println("Using requestDispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("firSuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
        servletResponse.setContentType("text/html");
        System.out.println("Thanks for Submit");
    }
}
