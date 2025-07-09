package org.set;

import java.util.TreeSet;

/**
 * ❌ 3. TreeSet with Custom Class without Comparable
 *
 * Yaha we have Employee class and I am adding objects of Employee class to TreeSet obj
 * But Employee class is not impleenting Comparable interface and overriding its compareTo() method.
 * And So if u try to print TreeSet obj u will get ClassCastException.
 *
 * Dekh bhai , scene yeh hah ki Employee object jab TreeSet me add hoga toh kisi sorted order me add hoga.
 *  Woh sorted hume id se karna hah ya name se karna hah , woh define karenge compareTo method me by implementing Comparable interface
 *  yaha hum Comparable interface ko implment nae kar rahe hah and compareTo method overrdide nae kr rahe ki kis order me
 *  Employee TreeSet me add ho.
 *
 *  And so TreeSet is throwing ClassCastException bcoz it doesn't know in wch sorted order to keep Employee objects
 */
public class P5_Employee {
    int id;
    String name;
    P5_Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {

        TreeSet<P5_Employee> set = new TreeSet<>();
        set.add(new P5_Employee(101, "John")); // Exception in thread "main" java.lang.ClassCastException
        System.out.println(set);

    }
}
