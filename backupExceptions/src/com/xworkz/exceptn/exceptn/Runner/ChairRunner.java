package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.ChairException;

public class ChairRunner extends RuntimeException{
    public static void main(String[] args) {
    boolean FiberChair = true;
    if(FiberChair){
        System.out.println("Yes");
    }
    else {
        throw new ChairException("Plastic");
    }
}}
