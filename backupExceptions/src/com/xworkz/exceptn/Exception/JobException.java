package com.xworkz.exceptn.Exception;

public class JobException extends RuntimeException{
    public JobException(){
        super();
    }
    public JobException(String Got){
      super(Got);
    }
}
