package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.MangoException;

public class MangoRunner extends RuntimeException{
    public static void main(String[] args) {
        boolean isRaw =true;
        if(isRaw){
            System.out.println("Yes its Raw");
        }
        else {
            throw new MangoException("Its not raw");
        }
    }
}
