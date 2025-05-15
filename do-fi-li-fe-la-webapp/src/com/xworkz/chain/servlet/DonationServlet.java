package com.xworkz.chain.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/mix")
public class DonationServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running");
        String fname = servletRequest.getParameter("fname");
        String lname = servletRequest.getParameter("lname");
        String cause = servletRequest.getParameter("cause");
        String amount = servletRequest.getParameter("amount");
        String email = servletRequest.getParameter("email");



        System.out.println("Using requestDispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("donation.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
        servletResponse.setContentType("text/html");
        System.out.println("Thanks for Donating");
    }
}
