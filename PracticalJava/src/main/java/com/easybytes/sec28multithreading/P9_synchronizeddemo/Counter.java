package com.easybytes.sec28multithreading.P9_synchronizeddemo;

public class Counter {

    private int count = 0;

    public void incrementUnSynchronized(){
        count++;
    }

    public synchronized void incrementSynchronized(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
