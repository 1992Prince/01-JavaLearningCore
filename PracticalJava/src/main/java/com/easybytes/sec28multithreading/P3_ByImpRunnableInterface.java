package com.easybytes.sec28multithreading;

public class P3_ByImpRunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("I am business logic of thread via implementing Runnable interface");
    }

}
