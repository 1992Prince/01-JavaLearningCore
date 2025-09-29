package org.coding.p1_warmup;

public class P2_FindSecondLargestElement {

    /**
     *
     * Approach -
     * 1 - Find the largest element in array first
     * 2 - Now since we have largest element, now find second largest num
     * 3 - Initialize second largest num with Integer.MIN_VALUE;
     * 4 - And inside loop use condition - secondLargestNum < arr[i] && arr[i] != largestNum
     *
     * EDGE CASES - if array elemeent count is less than 2 wch is ignored here
     * if u want to cover then return no second largest element since array eles count is only 1
     *
     * Time Complexity - O(n) + O(n) = O(n)
     */
    static int secondLargestNum(int[] arr) {

        int largestNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(largestNum < arr[i]){
                largestNum = arr[i];
            }
        }

        // now largestNum will have actual largest num
        // lets find second largest num
        int secondLargestNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(secondLargestNum < arr[i] && arr[i] != largestNum){
                secondLargestNum = arr[i];
            }
        }

        return secondLargestNum;
    }

    public static void main(String[] args) {

        int[] arr = {4, 9, 0, 2, 8, 7, 1};

        System.out.println("Largest Num in given array is : " + secondLargestNum(arr));
    }
}
