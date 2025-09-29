package org.coding.arrays.easy;

public class P1_MissingInArray {

    static int missingNum(int arr[]) {

        int expectedSum = 0;
        int actualSum = 0;
        for(int i=1;i<=arr.length+1;i++){
            expectedSum += i;
        }

        for(int i=0;i<arr.length;i++){
            actualSum +=  arr[i];
        }

        return (expectedSum - actualSum);

    }
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 5};
        System.out.println(missingNum(arr1));

        System.out.println();

        int[] arr2 = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(missingNum(arr2));

        System.out.println();

        int[] arr3 = {1};
        System.out.println(missingNum(arr3));

        System.out.println();


    }
}
