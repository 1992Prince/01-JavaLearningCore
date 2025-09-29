package org.coding.p1_warmup;

public class P1_FindLargestElement {

    static int largestNum(int[] arr) {

        int largestNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(largestNum < arr[i]){
                largestNum = arr[i];
            }
        }

        return largestNum;
    }

    public static void main(String[] args) {

        int[] arr = {4, 9, 0, 2, 8, 7, 1};

        System.out.println("Largest Num in given array is : " + largestNum(arr));
    }
}
