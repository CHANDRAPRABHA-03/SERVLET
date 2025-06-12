package com.xworkz.tour.servlet.service;

import com.xworkz.tour.servlet.dto.StampedCaseDto;
import com.xworkz.tour.servlet.repository.StampedCaseRepositoryImpl;
import com.xworkz.tour.servlet.repository.StampedRepo;

public class StampedCaseServiceImpl implements StampedCaseService{

    @Override
    public boolean save(StampedCaseDto stampedCaseDto) {
        if(stampedCaseDto!=null){
            String name=stampedCaseDto.getEvent();
            if(name.length()>2){
                System.out.println("Valid Name");
            }
            else {
                System.out.println("Invalid");
                return false;
            }
            StampedRepo stampedCaseRepository = new StampedCaseRepositoryImpl();
            stampedCaseRepository.persist(stampedCaseDto);

        }
        return false;
}
}