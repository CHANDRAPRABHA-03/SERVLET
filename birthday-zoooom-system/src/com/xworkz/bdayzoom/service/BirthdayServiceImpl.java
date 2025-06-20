package com.xworkz.bdayzoom.service;

import com.xworkz.bdayzoom.dto.BirthdayDto;
import com.xworkz.bdayzoom.repository.BirthdayRepo;
import com.xworkz.bdayzoom.repository.BirthdayRepoImpl;

import java.util.Optional;

public class BirthdayServiceImpl implements BirthdayService {
    @Override
    public boolean save(BirthdayDto birthdayDto) {
        boolean valid =true;
        if(birthdayDto==null){
            System.out.println("DTO returning null");
            valid =false;
        }
        if(birthdayDto.getPerson_name()==null){
            System.out.println("Invalid PersonName");
            valid = false;
        }
        if (birthdayDto.getEvent_date() == null ) {
            System.out.println("Invalid EventDate");
            valid = false;
        }
        if (birthdayDto.getLocation() == null ) {
            System.out.println("Invalid Location");
            valid = false;
        }
        if (birthdayDto.getContact() == 0 ) {
            System.out.println("Invalid contact,Needs 10 Digits");
            valid = false;
        }
        if (birthdayDto.getRelation() == null ) {
            System.out.println("Invalid relation");
            valid = false;
        }
        if (birthdayDto.getCake_info() == null ) {
            System.out.println("Invalid cakeInfo");
            valid = false;
        }
        System.out.println("Data is valid, will save into DATABASE using repo");

        BirthdayRepo birthdayRepo = new BirthdayRepoImpl();
        boolean repo =birthdayRepo.persist(birthdayDto);
        return valid;
    }

    @Override
    public Optional<BirthdayDto> findById(int birthday_id) {
        System.out.println("Running findById in BirthdayServiceImpl");
        if(birthday_id>0)
        {
            System.out.println("id is valid :"+birthday_id);// call the repo
            BirthdayRepo birthdayRepo=new BirthdayRepoImpl();
            return birthdayRepo.findById(birthday_id);
        }
        return BirthdayService.super.findById(birthday_id);
    }
}
