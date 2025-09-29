package org.coding.p1_warmup.p3_startpatterns;

public class Pattern2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();  // for coming to next line

        }

        /**
         *          *
         *          *  *
         *          *  *  *
         *          *  *  *  *
         */
    }
}
