package org.coding.p1_warmup.p3_startpatterns;

public class Pattern4 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();  // for coming to next line

        }

        /**
         *          1
         *          1 2
         *          1 2 3
         *          1 2 3 4
         *          1 2 3 4 5
         */
    }
}
