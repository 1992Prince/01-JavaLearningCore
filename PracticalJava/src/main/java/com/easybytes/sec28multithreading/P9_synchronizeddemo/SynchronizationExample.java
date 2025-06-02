package com.easybytes.sec28multithreading.P9_synchronizeddemo;


public class SynchronizationExample {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Runnable  synchronizedtask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementSynchronized();
            }
        };

        /*
        Below both threads are trying to update same count value
        with help of incrementSynchronized method.
        since there is synchronization involved here,we will get excat value of count in every output

        We can use synchronized keyword with method, block or object to achieve synchronization
         */

        Thread thread1 = new Thread(synchronizedtask);
        Thread thread2 = new Thread(synchronizedtask);

        // starting both threads
        thread1.start();
        thread2.start();

        /*
        I want main method to wait for above both threads to complete its execution before printing count
         */
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // printing total count value
        System.out.println("Count : " + counter.getCount()); // Count : 2000
    }
}
