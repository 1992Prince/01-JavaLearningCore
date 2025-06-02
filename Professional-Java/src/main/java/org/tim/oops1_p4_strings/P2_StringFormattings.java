package org.tim.oops1_p4_strings;

public class P2_StringFormattings {

    public static void main(String[] args) {

        int age = 35;
        System.out.printf("your age is %d\n", age);  // your age is 35

        // also we can use %n instead of \n
        // %d is specifier for int, short, long
        // %f is specifier for float
        // %s is specifier for Strings
        int yearOfBirth = 2025 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth); // Age = 35, Birth year = 1990
        System.out.printf("Age = %d, Birth year = %f%n", age, (float)yearOfBirth); // Age = 35, Birth year = 1990.000000
        // if we want only till 2 decimal places
        System.out.printf("Age = %d, Birth year = %.2f%n", age, (float)yearOfBirth); // Age = 35, Birth year = 1990.00

        /**
         * We can use System.out.format() how we used System.out.printf()
         * The only difference is that we need to use %s for String
         * and %n for new line
         *
         * There will be times u want to format strings and output them to a file or error.log file or may be in database
         * String class have 2 methods to support this type of formatting as well.
         * One is static method called format()
         * and another method is formatted included in jdk 15
         */

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString); // Your age is 35

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString); // Your age is 35


    }
}
