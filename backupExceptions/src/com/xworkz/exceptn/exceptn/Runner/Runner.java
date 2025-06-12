package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.HealthExceptions;

public class Runner extends RuntimeException{
    public static void main(String[] args) {
    boolean amGood = true;
    if(amGood){
        System.out.println("Am Okay");
    }
    else {
        throw new HealthExceptions("AM Not Well");
    }
    }
}
