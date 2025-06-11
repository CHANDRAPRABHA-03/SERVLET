package com.xworkz.tour.servlet.repository;


import com.xworkz.tour.servlet.dto.FeedbackDto;

public class FeedbackRepoImpl implements FeedbackRepo {

            @Override
            public void persist(FeedbackDto feedbackDto) {
                System.out.println("persist running in FeedbackRepo");
                if (feedbackDto != null) {
                    System.out.println("Not null");
                } else {
                    System.out.println("null");

                }
            }
        }