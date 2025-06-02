package com.tim.p3_boxing;

public class P1_Basics {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15);     // preferred but unnecessary
        // Integer deprecatedBoxing = new Integer(15); // depreceated from jdk 9
        int unboxedInt = boxedInt.intValue();          // unnecessary

        // Autoboxing
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;
        System.out.println(autoBoxed.getClass().getName());       // java.lang.Integer
        // System.out.println(autoUnboxed.getClass().getName()); // will throw compile error bcoz autoUnboxed is primitive type
    }
}
