package com.strings;

public class P1_StringFormatting {

    public static void main(String[] args) {


        String name = "Alice";
        int age = 30;
        double salary = 45000.75;

        String result = String.format("Name: %s, Age: %d, Salary: $%.2f", name, age, salary);
        System.out.println(result); // Name: Alice, Age: 30, Salary: $45000.75

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();


        // Product details
        String[] products = {"Apple", "Banana", "Orange"};
        double[] prices = {1.50, 0.75, 0.90};
        int[] quantities = {10, 50, 30};

        // Print the header of the table
        System.out.println("Product     | Price  | Quantity");
        System.out.println("--------------------------------");

        // Iterate through the products and print each row
        for (int i = 0; i < products.length; i++) {
            String formattedRow = String.format("%-10s | %6.2f | %8d", products[i], prices[i], quantities[i]);
            System.out.println(formattedRow);
        }

        System.out.println();
        System.out.println("-".repeat(50));
        System.out.println();
    }
}
