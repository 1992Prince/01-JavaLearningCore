package com.easybytes.sec14exception.custom;

/*
It is must to extend RuntimeException class and
And now our own custom unchecked exception is ready
it will make DivideByZeroException as UnChecked exception
 */
public class DivideByZeroException extends RuntimeException{

    public DivideByZeroException(){
        super();
    }

    public DivideByZeroException(String message){
        super(message);
    }
}
