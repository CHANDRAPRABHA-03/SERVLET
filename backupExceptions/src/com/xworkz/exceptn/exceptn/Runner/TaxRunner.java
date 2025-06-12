package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.TaxException;

public class TaxRunner extends RuntimeException{
    public static void main(String[] args) {
        boolean notapplicable = true;
        if (notapplicable) {
            System.out.println("Not Applicable");
        } else {
            throw new TaxException("Applicable");
        }
    }}