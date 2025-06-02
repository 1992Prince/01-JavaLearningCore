package com.easybytes.sec12arrays.tim;

import java.util.Arrays;
import java.util.Scanner;

public class p7_minimumelementchallenge {

    /*
    The Integer.parseInt() method in Java is used to convert a string into an integer
    String number = "1234";
    int result = Integer.parseInt(number);
    System.out.println(result);  // Output: 1234

     */

    public static void main(String[] args) {

        int[] myIntegers = readIntegers(); // Read integers from the console
        System.out.println("The array elements are: " + Arrays.toString(myIntegers));
        int min = findMin(myIntegers); // Find the minimum value in the array
        System.out.println("The minimum value in the array is: " + min);

    }

    private static int[] readIntegers() {
        // logic to read integers from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by commas: ");
        String input = scanner.nextLine();
        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }

        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int ele : array) {
            if (ele < min) {
                min = ele;
            }
        }
        return min;
    }
}
