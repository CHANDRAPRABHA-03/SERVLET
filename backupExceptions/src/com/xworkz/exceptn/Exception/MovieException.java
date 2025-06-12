package com.xworkz.exceptn.Exception;

public class MovieException extends RuntimeException {
    public MovieException() {
        super();
    }

    public MovieException(String Message) {
        super(Message);
    }
}