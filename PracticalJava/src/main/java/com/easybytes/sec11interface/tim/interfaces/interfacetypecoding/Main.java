package com.easybytes.sec11interface.tim.interfaces.interfacetypecoding;

public class Main {

    public static void main(String[] args) {

        Payment  creditCardPayment = new CreditCardPayment();
        Payment  payPalPayment = new PayPalPayment();

        PaymentService paymentService = new PaymentService(creditCardPayment);
        paymentService.processPayment(100.0);

        paymentService = new PaymentService(payPalPayment);
        paymentService.processPayment(200.0);
    }
}
