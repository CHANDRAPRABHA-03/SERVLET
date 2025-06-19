package com.xworkz.bloodbank.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BloodDto {
    private String donarName;
    private String bloodGroup;
    private Long contactNo;
    private int donarAge;
    private String gender;
    private String location;
}
