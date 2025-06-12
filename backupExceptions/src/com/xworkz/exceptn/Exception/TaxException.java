package com.xworkz.exceptn.Exception;

public class TaxException extends RuntimeException{
    public TaxException(){
        super();
    }
    public TaxException(String apply){
        super(apply);
    }
}
