package org.coding.arrays.basic;

public class P14_LastIndexOfOne {

    public static int lastIndex(String s) {
        int val = s.lastIndexOf('1');

        return val;
    }

    public static void main(String[] args) {

        System.out.println(lastIndex("00001"));
        System.out.println(lastIndex("0"));
    }
}
