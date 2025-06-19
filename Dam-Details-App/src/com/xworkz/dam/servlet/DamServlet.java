package com.xworkz.dam.servlet;

import com.xworkz.dam.dto.DamDto;
import com.xworkz.dam.service.DamService;
import com.xworkz.dam.service.DamServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(urlPatterns = "/Dam")
public class DamServlet extends HttpServlet {
public DamServlet(){
    System.out.println("DamServlet has no arg constructor");
}
protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
String name = req.getParameter("damName");
String location = req.getParameter("location");
String district = req.getParameter("district");
String constructionDate = req.getParameter("constructionDate");
String capacity = req.getParameter("capacity");
String hydroElectric = req.getParameter("hydroElectric");

    DamDto damDto = new DamDto(name,location,district,LocalDate.parse(constructionDate),Integer.parseInt(capacity),Boolean.parseBoolean(hydroElectric));

    DamService damService = new DamServiceImpl();
     String result = damService.save(damDto);
    System.out.println("Result :"+result);

}
}
