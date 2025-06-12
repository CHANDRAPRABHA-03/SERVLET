package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.JobException;

public class BackUpRunner extends RuntimeException {
    public static void main(String[] args) {
        boolean Done = true;
        if(Done){
            System.out.println("Done");
        }
        else{
            throw new JobException("NOt Done ");
        }
}}
