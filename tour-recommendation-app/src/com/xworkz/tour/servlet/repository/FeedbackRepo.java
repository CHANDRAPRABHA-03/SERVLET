package com.xworkz.tour.servlet.repository;


import com.xworkz.tour.servlet.dto.FeedbackDto;

public interface FeedbackRepo {

    void persist(FeedbackDto feedbackDto);

}