package com.easybytes.sec28multithreading;

public class P7_CurrentThreadDemo {

    /*
    Thread class currentThread() method returns a reference to the current thread

    below is demo
     */

    public static void main(String[] args) {

        /*
        Here I am not creating any new thread, we have only main thread
         */

        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread id is - " + mainThread.threadId());  // Main Thread id is - 1
        System.out.println("Main Thread name is - " + mainThread.getName()); // Main Thread name is - main
    }
}
