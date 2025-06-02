package com.easybytes.sec28multithreading;

/*
Thread class also implemented Runnable interface.
run() method is declared inside Runnable interface
inside run() method we specify business logic which needs to be executed on new thread

start() method is part of Thread class and not of Runnable interface

Runnable interface is functional interface and it has only one abstract method called run()

Below we have 2 threads, first is t1 and second is main thread
 */
public class P2_ByExtedingThreadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running via extending Thread class");
    }

}
