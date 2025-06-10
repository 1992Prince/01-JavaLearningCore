package org.tim.sec7constructors2;

class Parent{
    Parent(int x) {
        System.out.println("Parent constructor with x: " + x);
    }
}
public class P4_Child extends Parent {

    P4_Child() {
        super(100); // Must call explicitly because no no-arg constructor in Parent
        System.out.println("Child constructor");
    }

    public static void main(String[] args) {
        P4_Child c = new P4_Child();

        /**
         * Output
         * Parent constructor with x: 100
         * Child constructor
         */
    }
}
