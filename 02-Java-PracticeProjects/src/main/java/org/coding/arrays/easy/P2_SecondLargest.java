package org.coding.arrays.easy;

public class P2_SecondLargest {
    public static int getSecondLargest(int[] arr) {

        int largest = arr[0];
        int secLargest = -1;

        // find largest ele first
        for(int i=1;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        // find second largest ele now
        for(int i=0;i<arr.length;i++){
            if(secLargest < arr[i] && largest != arr[i]){
                secLargest = arr[i];
            }
        }

        System.out.println("largest ele : " + largest + " seclargest : " + secLargest);
        return secLargest;

    }

    public static void main(String[] args) {

        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr1));

        System.out.println();

        int[] arr2 = {10, 5, 10};
        System.out.println(getSecondLargest(arr2));

        System.out.println();

        int[] arr3 = {10, 10, 10};
        System.out.println(getSecondLargest(arr3));

        System.out.println();

        int[] arr4 = {28078, 19451, 935, 28892, 2242, 3570, 5480, 231};
        System.out.println(getSecondLargest(arr4));
    }
}
