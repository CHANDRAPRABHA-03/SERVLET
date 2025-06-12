package com.xworkz.tour.servlet.dto;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StampedCaseDto {
    private String event;
    private String noOfDeaths;
    private String noOfInjuries;
    private String location;
}