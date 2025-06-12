package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.JobException;

public class MovieRunner extends RuntimeException{
    public static void main(String[] args) {
        boolean released = true;
        if(released){
            System.out.println("Yes,Released");
        }
        else{
            throw new JobException("NO");
        }
}}
