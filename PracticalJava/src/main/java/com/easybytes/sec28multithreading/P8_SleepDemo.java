package com.easybytes.sec28multithreading;

public class P8_SleepDemo {



    public static void main(String[] args) {

       long starTime =  System.currentTimeMillis();

        for (int i = 0; i < 5; i++) {
            System.out.println("Inside main ... - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Total time taken - " + (endTime - starTime));
    }
}
