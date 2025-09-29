package org.coding.p1_warmup.p3_startpatterns;

public class Pattern5 {

    public static void main(String[] args) {

        int rows = 7; // rows

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();  // for coming to next line

        }

        /**
         * 1 2 3 4 5 6 7
         * 1 2 3 4 5 6
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1 
         */
    }
}
