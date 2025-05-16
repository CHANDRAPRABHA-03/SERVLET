package com.xworkz.silk.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
@WebServlet(urlPatterns = "/lab")
public class LaboratoryServlet extends HttpServlet {
    public LaboratoryServlet(){
        System.out.println("Created by servlet");
    }
    @Override
    public static LaboratoryServlet get() {

    }
}
