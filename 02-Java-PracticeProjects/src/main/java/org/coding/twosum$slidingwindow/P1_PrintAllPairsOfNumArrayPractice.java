package org.coding.twosum$slidingwindow;

public class P1_PrintAllPairsOfNumArrayPractice {

    /*
    This will be input for other coding problems
    suppose if u are given an array - [2,7,11,15]
    Then its all combination pairs are  -
    (2,7)  (2,11) (2,15)
    (7,11) (7,15)
    (11,15)

    To print it via code, we need to use nested for loop

    But this is good for brute force approach since its time complexity will be O(n²)
     */

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1;j<nums.length;j++){
                System.out.print("( " + nums[i] + " , " + nums[j] + " )" + " ");
            }
            System.out.println();
        }
    }
}
