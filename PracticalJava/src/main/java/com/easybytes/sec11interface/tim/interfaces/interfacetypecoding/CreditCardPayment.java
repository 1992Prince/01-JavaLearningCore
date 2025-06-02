package com.easybytes.sec11interface.tim.interfaces.interfacetypecoding;

public class CreditCardPayment implements Payment{
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid " + amount + " using " + getClass().getSimpleName());
    }
}
