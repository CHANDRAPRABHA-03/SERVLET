package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.RainException;

public class RainRunner extends RuntimeException{
    public static void main(String[] args) {
        boolean Notsure= false;
        if (Notsure){
            System.out.println("Not Sure");
        }
        else {
            throw new RainException("Sure");
        }
    }
}
