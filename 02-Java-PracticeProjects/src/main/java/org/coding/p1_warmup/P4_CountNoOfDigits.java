package org.coding.p1_warmup;

public class P4_CountNoOfDigits {

    // Count the number of digits in 43445.
    // Expected Output: 5

    public static void main(String[] args) {

        int num = 4335;
        int count = 0;

        while(num > 0){
            int lastDigit = num % 10;
            count++;
            num = num / 10;
        }

        System.out.println("No of digits are - " + count);

        /**
         * Here we are consdiring num is always greater than 0
         * and if u want to cover edge case 0 also then add condition num >= 0
         */
    }
}
