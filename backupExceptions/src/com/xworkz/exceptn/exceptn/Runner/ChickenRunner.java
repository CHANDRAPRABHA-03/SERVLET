package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.ChickenException;

public class ChickenRunner extends RuntimeException{
    public static void main(String[] args) {
        boolean isNonVeg = false;
    if(isNonVeg){
        System.out.println("Yes,Chicken is non veg");
    }
    else {
        throw new ChickenException("Chicken cannot be served to vegetarians!");
    }
}
}
