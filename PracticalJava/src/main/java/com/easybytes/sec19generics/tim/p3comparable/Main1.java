package com.easybytes.sec19generics.tim.p3comparable;

import java.util.Arrays;

public class Main1 {

    /*
    Types like String, or primitive wrapper classes like Integer or Character are sortable,
    and this is because they do implement this interface Comparable

    public interface Comparable<T> {
        int compareTo(T o);
    }

    zero  0 == this
    positive this > 0
    negative this < 0

    If u want to compare two customize class objects then they should first implement Comparable interface
    and then only u can compare them, like below Student class is implementing Comparable interface and now
    we can compare two Student objects to each other.

    Below we are comparing Integer objects to each other since they implements Comparable interface.
    Primitive int values can be compared directly using comparison operators.
    below this is 5 and o is element of {0, 5, 10, -50, 50}
     */

    public static void main(String[] args) {

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i: others){
            int val = five.compareTo(i);
            System.out.print(val + " ");  // 1 0 -1 1 -1
        }

        System.out.println();
        System.out.println("--------------------String Comparison---------------------");

        /*
        String implements Comparable interface and so we can compare 2 String objects also
        compareTo() method compares two strings lexicographically
        Returns 0 if the string is equal to the other string
        Returns a positive value if the string is lexicographically greater than the other string
        Returns a negative value if the string is lexicographically less than the other string

        here this is banana and o is element of {"apple", "banana", "pear", "BANANA"}
         */

        String banana = "banana";
        String[] fruits = {"apple", "banana", "pear", "BANANA"};

        for (String s: fruits){
            int val = banana.compareTo(s);
            System.out.print(val + " ");  // 1 0 -14 32
        }

        System.out.println();
        System.out.println();
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits)); // [BANANA, apple, banana, pear]

        System.out.println();
        System.out.println("A:"+(int)'A' + " " + "a:" + (int)'a'); // A:65 a:97
        System.out.println("B:"+(int)'B' + " " + "b:" + (int)'b'); // B:66 b:98
        System.out.println("C:"+(int)'C' + " " + "c:" + (int)'c'); // C:67 c:99
        System.out.println("P:"+(int)'P' + " " + "p:" + (int)'p'); // P:80 p:112

        /*
        You may remember, chars are stored in memory as positive integer values,

        and that's what this is showing. A capital A is stored as 65.

        A lowercase A is stored as a 97. When we use the compare To method on

        Strings, we're really comparing the integer values of the characters, in the strings.

        The method will compare the first characters, and if they're the same, it next compares the second

        characters, and so on, returning the difference between the character's underlying integer values.

        This is how Java implemented the compare To method on the String class.
         */

        System.out.println();
        System.out.println();
        System.out.println("--------------------Custom Class Comparison---------------------");


        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};
        // want to sort students objs on base of their name
        Arrays.sort(students);
        System.out.println(Arrays.toString(students)); // [Ann, Tim, Zach]


        /*
        Also we can't just compare any arrays of custom classes via Arrays.sort() method bcoz
        they don't impelemnt Comparable interface by default.
        If u want to compare custom classes, u have to implement Comparable interface and override compareTo()
        method like below we did for Student class

        tim.compareTo("Zach"); // will give compile time error bcoz Generics is used and T type is Student and
        only Student type can be passed as argument for comparison

         Sorting and comparing objects,
        meaning instances of your own classes, will be something that you'll be doing a lot.

        You will use Comparable, when something has a natural order, as we saw here with student names.

        Natural order means that your object's compareTo method, will return a zero if one object is

        considered equal to another, or the equals method returns true, when the compare 2 method returns 0.

         */
        tim.compareTo(new Student("Zach"));

    }

}

/*
Below we have class Student and we want natural order to be based on "name".
Here Students class implements Comparable interface and overrides compareTo() method that defines natural order
based on name field.
So when u sort list of Student objects, they will be sorted based on name field in ascending order by default.
.
So, we can sort an array of Student objects using Arrays.sort() method, and it will use the compareTo() method

 */
class Student implements Comparable<Student>{

    private String name;
    public Student(String name) {
        this.name = name;
    }

    @Override
   public String toString(){
        return name;
   }

   // I want to do comparison based on student name
    @Override
    public int compareTo(Student o) {
        return  name.compareTo(o.name);
    }


}
