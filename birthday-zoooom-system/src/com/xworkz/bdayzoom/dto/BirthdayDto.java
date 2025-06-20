package com.xworkz.bdayzoom.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class BirthdayDto {
    private String person_name;
    private LocalDate event_date;
    private String location;
    private long contact;
    private String relation;
    private String cake_info;
}
