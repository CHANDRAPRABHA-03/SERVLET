package com.xworkz.chain.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/lab")
public class LaboratoryServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name = servletRequest.getParameter("name");
        String mail = servletRequest.getParameter("email");
        String mobile = servletRequest.getParameter("mobile");
        String address = servletRequest.getParameter("address");
        String sample = servletRequest.getParameter("sample");
        System.out.println("Using requestDispatcher to forward the req and res to another jsp/servlet");
        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("laboratorySuccess.jsp");
        requestDispatcher.forward(servletRequest,servletResponse);
        servletResponse.setContentType("text/html");
        System.out.println("Thank you");
    }
}
