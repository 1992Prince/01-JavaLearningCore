package com.easybytes.sec28multithreading;

public class P5_Main {

    public static void main(String[] args) {

        /*
        Approach 1 - creating thread via extending Thread class
         */
        P2_ByExtedingThreadClass t1 = new P2_ByExtedingThreadClass();
        t1.start();

        System.out.println();

        /*
        Approach2 - creating thread via implementing Runnable interface

        Thread class accepts Runnable Functional interface impl

        below creating thread via implementing Runnable interface

        Also u can give run() method imp via lambda exp as shown in P1 class
         */
        Thread t2 = new Thread(new P3_ByImpRunnableInterface());
        t2.start();

        System.out.println();

        /*
        Approach 3 - 
        creating thread from method ref approach
         */
        Thread t3 = new Thread(P4_Hello::sayHello);
        t3.start();

        System.out.println();


        /*
        Above we have 4 threads running in parallel, main thread, t1, t2 and t3
         */
    }
}
