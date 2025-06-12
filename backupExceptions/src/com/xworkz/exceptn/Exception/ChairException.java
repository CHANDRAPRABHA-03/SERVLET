package com.xworkz.exceptn.Exception;

    public class ChairException extends RuntimeException{
        public ChairException(){
            super();
        }
        public ChairException(String material){
            super(material);
        }
    }

