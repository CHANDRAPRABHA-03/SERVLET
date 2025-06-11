package com.xworkz.tour.servlet.service;

public class FeedbackServiceImpl implements FeedbackService{

    @Override
    public boolean save(FeedbackDto feedbackDto) {
        if(feedbackDto!=null){
            String name=feedbackDto.getName();
            if(name.length()>2){
                System.out.println("Valid Name");
            }
            else {
                System.out.println("Invalid");
                return false;
            }


        }
        return false;
}
}