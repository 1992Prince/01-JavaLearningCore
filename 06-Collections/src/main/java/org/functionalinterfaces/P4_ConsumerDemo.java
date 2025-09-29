package org.functionalinterfaces;

import java.util.function.Consumer;

public class P4_ConsumerDemo {

    public static void main(String[] args) {

        //Req - calculate emi value and print it
        LoanInfo loan = new LoanInfo(60,300000,10);
        LoanInfo loan2 = new LoanInfo(30,100000,15);

        /**
         * We need to write logic for calculating emi value as per loan amount in
         * Consumer FI and logic have to be defined in abstract method  apply
         *
         * I/P will be nothing and O/P wil be
         */

        Consumer<LoanInfo> emiCalculator = l -> {
            double P = l.getLoanAmount();
            double R = l.getInterestRate() / 12 / 100; // monthly interest rate
            int N = l.getNoOfMonths();

            double emi = (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
            System.out.printf("EMI for loan amount ₹%.2f over %d months at %.2f%% is: ₹%.2f\n",
                    P, N, l.getInterestRate(), emi);
        };

        // Now as per loan object it will provide emi details
        emiCalculator.accept(loan);
        // EMI for loan amount ₹300000.00 over 60 months at 10.00% is: ₹6374.11

        // emi details for loan object 2
        emiCalculator.accept(loan2);
        // EMI for loan amount ₹100000.00 over 30 months at 15.00% is: ₹4017.85

        System.out.println();

        // Req - ✅ 1. Consumer<Integer> – Square a number
        Consumer<Integer> printSquare = x -> System.out.println("Square: " + (x * x));
        printSquare.accept(5);  // Output: Square: 25

        System.out.println();

        // Req - ✅ 2. Consumer<Double> – Print 10% discount of a price
        Consumer<Double> discountConsumer = price -> {
            double discount = price * 0.10;
            System.out.println("Discount on ₹" + price + " is ₹" + discount);
        };
        discountConsumer.accept(1500.0);  // Output: Discount on ₹1500.0 is ₹150.0

        System.out.println();

        // Req - ✅ 3. Consumer<String> – Print greeting in uppercase

        Consumer<String> greet = name -> System.out.println("Hello " + name.toUpperCase() + "!");
        greet.accept("dilip");  // Output: Hello DILIP!


    }
}
