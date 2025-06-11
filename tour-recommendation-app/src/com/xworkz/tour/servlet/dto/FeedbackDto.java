package com.xworkz.tour.servlet.dto;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class FeedbackDto {

    private String name;
    private String email;
    private String contact;
    private  String feedback;
}