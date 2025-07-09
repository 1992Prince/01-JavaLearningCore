package org.set;

import java.util.TreeSet;

public class P4_StudentMain {

    public static void main(String[] args) {

        TreeSet<P4_Student> set = new TreeSet<>();
        set.add(new P4_Student(2, "Raj"));
        set.add(new P4_Student(1, "Aman"));
        set.add(new P4_Student(3, "Zoya"));

        System.out.println(set); // [1 - Aman, 2 - Raj, 3 - Zoya]
    }
}
