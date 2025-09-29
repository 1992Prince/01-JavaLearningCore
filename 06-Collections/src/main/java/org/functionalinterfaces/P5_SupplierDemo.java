package org.functionalinterfaces;

import java.util.function.Supplier;

public class P5_SupplierDemo {

    /**
     * 🔹 What is Supplier<T>?
     *      Represents a supplier of results.
     *      Has no input, only returns something.
     *      Functional abstract method: T get()
     */

    public static void main(String[] args) {

        // Req1 - ▶️ Supplier<Integer> – Random number
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);
        int randomVal = randomSupplier.get();
        System.out.println("Random Number: " + randomVal);

        System.out.println();

        // Req2 - ▶️ Supplier<Double> – Fixed interest rate
        Supplier<Double> interestRateSupplier = () -> 7.5;
        System.out.println("Interest Rate: " + interestRateSupplier.get() + "%");

        System.out.println();

        // Req3 - ▶️ Supplier<String> – Greeting message
        Supplier<String> greetSupplier = () -> "Welcome to Supplier Demo!";
        System.out.println(greetSupplier.get());





    }
}
