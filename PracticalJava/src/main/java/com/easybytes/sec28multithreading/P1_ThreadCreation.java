package com.easybytes.sec28multithreading;

public class P1_ThreadCreation {

    public static void main(String[] args) {

        /*
        Most simple way of creating thread in Java
         */
        Thread t1 = new Thread();
        // startng thread
        t1.start();
        /*
        t1.start() => now jvm will request operating system to schedule above thread object to begin its execution.
        Here we created thread object t1 inside main thread but this t1 thread obj will run independently from main thread.

        If we run this code thing will happen bcoz we are not giving any business logic to above thread object to execute.
        */

        /*
        creating another thread obj with some business logic

        Thread constructor which accepts lambda expression as argument i.e. Runnable functional interface
         */
        Thread t2 = new Thread(() -> {
            System.out.println("Thread t2 is running");
        });
        t2.start();

        // creating third thread
        Runnable r3 = () -> System.out.println("Thread t3 is running");
        Thread t3 = new Thread(r3);
        t3.start();

        System.out.println("Hello from main thread");

        /*
        note - above all threads will run independently from main thread

        above we have 4 independent threads running in parallel i.e. main thread, t1, t2, t3

        Also start() method only creates new thread, if u use run method above instead of start() then
        execution will happen in sequence for above code.
        For more info read the doc present in folder bro.

        Start() method works with JVM to schedule this thread as separate thread inside operating system.
        And whenever this thread receives CPU time, internally it will invoke run() method.

        And inside run method business logic is written wch new thread have to be executed.
        So always we should call start() method to create thread

         */

    }
}
