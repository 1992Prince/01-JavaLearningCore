package org.coding.binarysearch;

public class P1_FindSqrtRoot {

    /*
    Below is brute force approach to find square root of a number
    edge case will be if input is 0 then expected should be 0
    Below we are doing linear search and time complexity is O(n)

    Brute Force Approach to mySqrt(x):
        - Start a loop from i = 0 up to i <= x.
        - For each i, calculate i * i (cast to long to avoid overflow).
        - If i * i equals x, return i — this is the exact square root.
        - If i * i becomes greater than x, return i - 1 — the previous i was the floor of the square root.
        - If the loop finishes without returning (shouldn’t happen for valid inputs), return 0 as a safe fallback.

     */
    public static int mySqrt1(int x) {

        for (int i = 0; i <= x; i++) {
            long square = (long) i * i; // avoid overflow
            if (square == x) {
                return i;
            } else if (square > x) {
                return i - 1;
            }
        }
        return 0; // should never reach here
    }

    /*
    Optimal approach
    We can optimize it with binary search

     */
    public static int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int start = 2;
        int end = x / 2;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            long square = (long) mid * mid;
            if (x == square) {
                return mid;
            } else if (x > square) {
                start = mid + 1;
            } else if (x < square) {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {

        /*System.out.println(mySqrt(4));
        System.out.println(mySqrt(9));
        System.out.println(mySqrt(16));
        System.out.println(mySqrt(25));*/


        //System.out.println(mySqrt(0));
        //System.out.println(mySqrt(20));
        //System.out.println(mySqrt(8));
        System.out.println(mySqrt(5));
       // System.out.println(mySqrt1(2147483647));
    }
}
