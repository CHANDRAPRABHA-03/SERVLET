package com.xworkz.tour.servlet.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class FeedbackDto {

    private String name;
    private String email;
    private String contact;
    private  String feedback;
}