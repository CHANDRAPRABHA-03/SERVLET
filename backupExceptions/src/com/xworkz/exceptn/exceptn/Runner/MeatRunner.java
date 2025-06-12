package com.xworkz.exceptn.exceptn.Runner;

import com.xworkz.exceptn.Exception.MangoException;

public class MeatRunner extends RuntimeException{
    public static void main(String[] args) {
            boolean isFresh =true;
            if(isFresh){
                System.out.println("Yes its Fresh");
            }
            else {
                throw new MangoException("Its not Fresh");
            }
        }
    }

