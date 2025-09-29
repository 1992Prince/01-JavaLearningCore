package org.coding.p1_warmup.p3_startpatterns;

public class Pattern1 {

    /**
     * Print star pattern
     *
     *     * * * *
     *     * * * *
     *     * * * *
     *     * * * *
     *
     */


    public static void main(String[] args) {

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(" * ");
            }
            System.out.println();  // for coming to next line

            /**
             *          *  *  *  *
             *          *  *  *  *
             *          *  *  *  *
             *          *  *  *  *
             */
        }
    }
}
