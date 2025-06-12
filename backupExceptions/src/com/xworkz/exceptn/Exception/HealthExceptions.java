package com.xworkz.exceptn.Exception;

    public class HealthExceptions extends RuntimeException{
        public HealthExceptions(){
            super();
        }
        public HealthExceptions(String Wellness){
            super(Wellness);
        }

    }
