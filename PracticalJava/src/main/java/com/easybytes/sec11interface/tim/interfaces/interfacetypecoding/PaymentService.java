package com.easybytes.sec11interface.tim.interfaces.interfacetypecoding;

public class PaymentService {
    // Use Interface Type in code

    Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }


    public void processPayment(double amount) {
        payment.makePayment(amount);
    }

}
