package com.easybytes.sec28multithreading;

public class P6_ThreadIdNameDemo {

    /*
    Thread class threadId() method returns the unique identifier of the thread
    Thread class getName() method returns the name of the thread

    below is demo of both methods
     */

    public static void main(String[] args) {

        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();

        // set t3 thread name
        t3.setName("MyThread");

        System.out.println("Thread 1 id is - " + t1.threadId() + " and thread name is - " +t1.getName());
        System.out.println("Thread 2 id is - " + t2.threadId() + " and thread name is - " +t2.getName());
        System.out.println("Thread 3 id is - " + t3.threadId() + " and thread name is - " +t3.getName());


        /*
        output
        Thread 1 id is - 22 and thread name is - Thread-0
        Thread 2 id is - 23 and thread name is - Thread-1
        Thread 3 id is - 24 and thread name is - MyThread
         */
    }
}
