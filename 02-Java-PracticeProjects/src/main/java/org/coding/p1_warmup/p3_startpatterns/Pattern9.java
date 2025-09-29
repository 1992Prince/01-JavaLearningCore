package org.coding.p1_warmup.p3_startpatterns;

public class Pattern9 {

    public static void main(String[] args) {

        // see how toggle works for 0 and 1
        int num1 = 1;
        for (int i = 0; i < 3; i++) {
            System.out.print(num1 + " ");
            num1 = 1 - num1;
        }

        // output = 1 0 1 [same above logic we will use to print pattern]
        //1
        //1 0
        //1 0 1
        //1 0 1 0
        //1 0 1 0 1
        //1 0 1 0 1 0
        System.out.println();
        System.out.println();

        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;  // toggle between 1 and 0
            }
            System.out.println(); // next line
        }
    }
}
