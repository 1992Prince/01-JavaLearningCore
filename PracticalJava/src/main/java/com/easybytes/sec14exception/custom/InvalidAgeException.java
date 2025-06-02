package com.easybytes.sec14exception.custom;

/*
It is must to extend Exception class and it will make InvalidAgeException as Checked exception
 */
public class InvalidAgeException extends Exception{

    public InvalidAgeException(){
        super();
    }

    public InvalidAgeException(String message){
        super(message);
    }
}
