package com.easybytes.sec19generics.tim.p4comparator;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};
        // want to sort students on base of their id
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        // [1001 - Zach (1.00), 1002 - Tim (1.31), 1003 - Ann (3.71)]


    }

}

