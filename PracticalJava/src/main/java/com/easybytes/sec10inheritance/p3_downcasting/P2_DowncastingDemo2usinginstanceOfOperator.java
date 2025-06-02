package com.easybytes.sec10inheritance.p3_downcasting;

import com.easybytes.sec10inheritance.p2_upcasting.Animal;
import com.easybytes.sec10inheritance.p2_upcasting.Cat;
import com.easybytes.sec10inheritance.p2_upcasting.Dog;

public class P2_DowncastingDemo2usinginstanceOfOperator {

    /*
    Note - Always remember Upcasting and Downcasting of method will happen only in Parent and child class
     */

    public static void main(String[] args) {

        Animal anm;

        Dog dog = new Dog();

        anm = dog; // upcasting

        /*
        // downcasting, we are doing explicitly
        If downcasting is not done explicitly, it will throw a ClassCastException

        To avoid ClassCastExcp while doing downcasting, lets use instanceOf() operator
         */

        if (anm instanceof Dog) {
            Dog dog2 = (Dog) anm;
            dog2.eat(); // Dog is eating
        } else {
            System.out.println("anm is not an instance of Dog");
        }


        /*
         below in anm reference var, dog obj is residing and
         we are trying to convert it to a Cat obj i.e. dog obj to cat obj and it will throw ClassCastException

         Cat cat = (Cat) anm;

        Exception in thread "main" java.lang.ClassCastException:
        class com.easybytes.sec10inheritance.p2_upcasting.Dog cannot be cast to class com.easybytes.sec10inheritance.p2_upcasting.Cat

        So to avoid ClassCastExcp while doing downcasting, lets use instanceOf() operator
         */

        if (anm instanceof Cat) {
            Cat cat = (Cat) anm;
            cat.eat();
        } else {
            System.out.println("anm is not an instance of Cat");
        }

        /*
        Output:
        Dog is eating
        anm is not an instance of Cat
         */
    }
}
