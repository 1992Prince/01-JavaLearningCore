package com.easybytes.sec10inheritance.tim.p1_stringformatting;

public class p1_formattingtext {

    /*
    \t - Insert a tab character
    \n - Insert a new line character
     */

    public static void main(String[] args) {

        String textblock = """
                Printed a BulletedList:
                \t First Point
                \t Second Point
                \t Third Point
                """;
        System.out.println(textblock);

        /*
        Printed a BulletedList:
	         First Point
	         Second Point
	         Third Point
         */

        /*
        printf doesn't comes to new line after printing and so using \n below for new line
        printf is used for formatting
        %d - Integer
        %s - String
        %f - Float
         */

        int age = 35;
        System.out.printf("Your age is %d\n" , age);  // Your age is 35

        /*
        In format specifier \n can be replaced by %n
         */

        int yearOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth); // Age = 35, Birth year = 1988

        // u can use %f for float numbers
        System.out.printf("Age = %d, Birth year = %f%n", age, (float)yearOfBirth); // Age = 35, Birth year = 1988.000000

        // specifying how many 0 have to be printed
        System.out.printf("Age = %d, Birth year = %.2f%n", age, (float)yearOfBirth); // Age = 35, Birth year = 1988.00

        /*
        There'll be times you want to format strings and output them to a file or error log, for example, or maybe to a database.
        The string class itself has two methods to support this type of formatting as well.
        One is a static method called format
         */

        String formattedString = String.format("Age = %d, Birth year = %.2f", age, (float)yearOfBirth);
        System.out.println(formattedString);  // Age = 35, Birth year = 1988.00

        /*
        And I could also have done
        that with the string instance method formatted. This method was included in JDK 15, and it works
        the same as string dot format except I don't need to pass the format string as an argument.
         */

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);  // Your age is 35

    }
}
