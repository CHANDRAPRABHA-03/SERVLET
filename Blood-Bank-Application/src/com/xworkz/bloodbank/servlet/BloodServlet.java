package com.xworkz.bloodbank.servlet;

import com.xworkz.bloodbank.dto.BloodDto;
import com.xworkz.bloodbank.service.BloodService;
import com.xworkz.bloodbank.service.BloodServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet(urlPatterns = {"/blood","/search"}, loadOnStartup = 1)
public class BloodServlet extends HttpServlet {

@Override
    protected  void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String donarName= req.getParameter("donarName");
        String bloodGroup= req.getParameter("bloodGroup");
        String contact= req.getParameter("contactNo");
        long contactNo =0;
        if(contact!=null){
            contactNo=Long.parseLong(contact);
        }

        String Age=req.getParameter("donarAge");
        int donarAge=0;
        if(Age!=null){
            donarAge = Integer.parseInt(Age);
        }

        String gender=req.getParameter("gender");
        String location=req.getParameter("location");

        BloodDto bloodDto = new BloodDto(donarName,bloodGroup,contactNo,donarAge,gender,location);

    BloodService bloodService = new BloodServiceImpl();
    boolean valid = bloodService.save(bloodDto);

    if(valid){
        System.out.println("Service done Succesfully");
        req.setAttribute("success","Blood Details Save Successfully");
    }
    else {
        System.out.println("NOT SAVED");
        req.setAttribute("dto",bloodDto);
        req.setAttribute("failure","Blood Details Not Saved Successfully");
    }
    RequestDispatcher requestDispatcher=req.getRequestDispatcher("/BloodDetails.jsp");
    requestDispatcher.forward(req,resp);

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("running get in BloodServlet..");
        String bloodId = req.getParameter("bloodId");
        if(bloodId!=null)
        {
            int id=Integer.parseInt(bloodId);
            System.out.println("search id :"+id);
            BloodService bloodService=new BloodServiceImpl();
            Optional<BloodDto> optionalBloodDto = bloodService.findById(id);
            if(optionalBloodDto.isPresent())
            {
                BloodDto bloodDto=optionalBloodDto.get();
                System.out.println("Blood data is found :"+bloodDto);

            }
            else{
                System.out.println("Blood data is not found for id :"+id);
            }
        }
    }
}
