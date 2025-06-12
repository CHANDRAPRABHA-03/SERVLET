package com.xworkz.tour.servlet.repository;


import com.xworkz.tour.servlet.dto.StampedCaseDto;

public interface StampedRepo {

    void persist(StampedCaseDto stampedCaseDto);

}