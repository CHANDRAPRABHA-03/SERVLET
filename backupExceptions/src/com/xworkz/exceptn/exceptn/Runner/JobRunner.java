package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.JobException;

public class JobRunner extends RuntimeException{
    public static void main(String[] args) {
        boolean GotJob = true;
        if(GotJob){
            System.out.println("I got JOb");
        }
        else{
            throw new JobException("Am not ");
        }
    }
}
