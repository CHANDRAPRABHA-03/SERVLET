package com.xworkz.exceptn.Exception;

public class MangoException extends RuntimeException{
    public MangoException(){
        super();
    }
    public MangoException(String Message){
        super(Message);
    }
}
