package com.easybytes.sec28multithreading.P9_synchronizeddemo;


public class UnsynchronizationExample {

    public static void main(String[] args) {

        Counter counter = new Counter();
        Runnable  unsynchronizedtask = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementUnSynchronized();
            }
        };

        /*
        Below both threads are trying to update same count value
        with help of incrementUnSynchronized method.
        since there is no synchronization involved here, chances are there we can get unexpected values of count

        To resolve above issue, we need to use synchronized keyword along with incrementSynchronized method
         */

        Thread thread1 = new Thread(unsynchronizedtask);
        Thread thread2 = new Thread(unsynchronizedtask);

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
        System.out.println("Count : " + counter.getCount());
    }
}
