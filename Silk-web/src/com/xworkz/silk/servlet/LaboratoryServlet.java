package com.xworkz.silk.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/lab")
public class LaboratoryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        System.out.println("Running Servlet in Tomcat");

        String name = req.getParameter("name");
        String mobile = req.getParameter("mobile");
        String sample = req.getParameter("sample");
        String address = req.getParameter("address");

        req.setAttribute("name","name");
        req.setAttribute("mobile","mobile");
        req.setAttribute("sample","sample");
        req.setAttribute("address","address");

        RequestDispatcher requestDispatcher= req.getRequestDispatcher("labsuccess.jsp");
        requestDispatcher.forward(req,resp);
    }
}
