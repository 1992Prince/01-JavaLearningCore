package com.easybytes.sec12arrays.tim;

import java.util.Arrays;

public class p1_arraybasics {

    public static void main(String[] args) {

        // Declaring array and initializing it later
        int[] marks;
        marks = new int[5]; // initializing the array with a size of 5

        // assigning values to the array
        marks[0] = 55;
        marks[1] = 65;
        marks[2] = 75;
        marks[3] = 85;
        marks[4] = 95;

        // marks[5] = 100; // This line will throw an ArrayIndexOutOfBoundsException

        // accessing the array elements
        System.out.println("Array size - " + marks.length);  // 5
        System.out.println("marks[0] - " + marks[0]);      // marks[0] - 55

        System.out.println();
        System.out.println();

        // Declaring array and initializing it at same time
        int[] marks1 = new int[5]; // Declaring an array of size 5
        marks1[0] = 150;

        System.out.println("Array size - " + marks1.length);  // 5
        System.out.println("marks[0] - " + marks1[0]);        // marks[0] - 150
        System.out.println("marks[1] - " + marks1[1]);       // marks[1] - 0 i.e. initialized with default value

        System.out.println();
        System.out.println();


        // Declaring array and initializing it with values
        int[] marks2 = {55, 65, 75, 85, 95};
        System.out.println("Array size - " + marks2.length); // Array size - 5

        System.out.println();

        // printing all array elements using for loop
        for (int i = 0; i < marks2.length; i++) {
            System.out.print(marks2[i] + " ");    // 55 65 75 85 95
        }

        System.out.println();
        System.out.println();

        /*
        below array is initialized wth default values
         */
        int[] marks3 = new int[3];
        for (int i = 0; i < marks3.length; i++) {
            System.out.print(marks3[i] + " ");    // 0 0 0
        }

        System.out.println();
        System.out.println();

        // using foreach loop i.e. enhanced for loop to print array elements
        System.out.println("Printing array elements using foreach loop");
        for (int mark : marks2) {
            System.out.print(mark + " ");    // 55 65 75 85 95
        }

        System.out.println();

        /*
        In Java, when you try to print an array using System.out.println, it does not print the contents of the array directly.
        Instead, it prints the type and a hashcode representation of the array, which typically looks like a somewhat cryptic string.

        int[] arr1 = {1, 2, 3};
        System.out.println(arr1);       // [I@15db9742

        For normal classes when we create it, we override toString() method of class to print  the contents of the class.
        But for arrays, the toString() method is not overridden in the array class, so it uses the default implementation

        So to print array content, we can use Arrays utility class static method Arrays.toString() method
         */
        System.out.println("Arrays.toString(marks2) - " + Arrays.toString(marks2)); // Arrays.toString(marks2) - [55, 65, 75, 85, 95]

        System.out.println();
        System.out.println();

        /*
        How can u prove that array is child of Object class
         */
        Object object = marks2;
        if (object instanceof Object) {
            System.out.println("marks2 is an instance of Object class"); // marks2 is an instance of Object class
        }

        System.out.println();

        /*
        Can we create any array where we can store elements of different data types

        yes, we can create an array of Object class
         */

        Object[] objArray = {1, "Hello", 3.14, true};
        System.out.println(Arrays.toString(objArray));  // [1, Hello, 3.14, true]


    }
}
