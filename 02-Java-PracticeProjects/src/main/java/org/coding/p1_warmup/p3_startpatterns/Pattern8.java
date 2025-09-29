package org.coding.p1_warmup.p3_startpatterns;

public class Pattern8 {

    public static void main(String[] args) {

        int rows = 5; // rows

        for (int i = 1; i <= rows; i++) {

            // first print space
            for (int space = 1; space <= (rows - i); space++) {
                System.out.print(" " + " ");
            }

            // now print star
            for (int star = 1; star <= i; star++) {
                System.out.print("*" + " ");
            }

            // now all items are printed in one line, break the line to new line
            System.out.println();

        }

        /**
         *         *
         *       * *
         *     * * *
         *   * * * *
         * * * * * *
         */
    }
}
