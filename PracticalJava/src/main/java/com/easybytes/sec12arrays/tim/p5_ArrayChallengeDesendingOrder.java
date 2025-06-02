package com.easybytes.sec12arrays.tim;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class p5_ArrayChallengeDesendingOrder {

    /*
    create a program using arrays that sorts a list of integers in descending order.
    Descending order is the highest value to lowest.
    In other words if the array had the values in it 106, 26, 81, 5, 15 your program should

    Create a array of randomly generated integers
    Print array before u sort it
    Sort array in descending order
    Print array after sorting it

    Below we will do sorting in descenging order in same array
     */

    public static void main(String[] args) {
        int[] array = getRandommArray(5);
        System.out.println("Array before sorting:");
        printArray(array);

        sortDescending(array);

        System.out.println("\nArray after sorting in descending order:");
        printArray(array);
    }

    public static void sortDescending(int[] arr) {

        /*
        Arrays.sort(arr); will sort array in ascending order. Also it can accept primitive type arrays also

        Arrays.sort(arr, Collections.reverseOrder()); will  not accept primitive type arrays

        n Java, arrays of primitive types (e.g., int[]) cannot be directly sorted in descending order using
        Collections.reverseOrder() because this method requires an array of objects
        (e.g., Integer[]). Java's autoboxing feature helps in converting between primitives and their corresponding wrapper classes,
         but it doesn't automatically apply to arrays.
         You need to manually convert the primitive array to an array of wrapper objects.

        Here’s why you can't use Collections.reverseOrder() with a primitive array directly:

        Collections.reverseOrder() works with objects, and int is a primitive type.

        The Arrays.sort() method that accepts a comparator works with Object[], not primitive arrays.

         Arrays.sort(arr, Collections.reverseOrder()); will give compile time error

        Here's a step-by-step approach to sort a primitive array in descending order, leveraging autoboxing for individual elements:

        Step 1: Convert the Primitive Array to a Wrapper Object Array
            Autoboxing happens when you convert from a primitive type to its corresponding wrapper class.
            For arrays, you need to convert the entire array from a primitive type array to a wrapper type array.

        Step 2: Sort the Wrapper Object Array in Descending Order
        Use Arrays.sort() with Collections.reverseOrder().

        Step 3: Convert Back to Primitive Array (if needed)
        If you need the result in a primitive array, convert the sorted wrapper array back to a primitive array.
         */

        // converting int array to Integer array
       Integer[] intOnjArr = new Integer[arr.length];
       for (int i=0; i< arr.length; i++) {
           intOnjArr[i] = Integer.valueOf(arr[i]);
       }

       Arrays.sort(intOnjArr, Collections.reverseOrder());

       // converting Integer array back to int array
       for (int i=0; i< arr.length; i++) {
           arr[i] = intOnjArr[i].intValue();
       }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getRandommArray(int length) {
        int[] randomArray = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            randomArray[i] = random.nextInt(1000);
        }
        return randomArray;
    }

    /*
    Notes

    The Integer.valueOf() method is used to convert a String or int into an Integer object.
    This method is particularly useful when you need to create an Integer object from a primitive int or a String
    representing an integer.

    Integer.intValue()
    The Integer.intValue() method is used to convert an Integer object back to a primitive int.
    This is useful when you need to extract the primitive int value from an Integer object.
     */
}
