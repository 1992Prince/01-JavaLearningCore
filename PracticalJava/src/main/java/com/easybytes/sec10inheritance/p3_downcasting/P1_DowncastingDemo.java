package com.easybytes.sec10inheritance.p3_downcasting;

import com.easybytes.sec10inheritance.p2_upcasting.Animal;
import com.easybytes.sec10inheritance.p2_upcasting.Cat;
import com.easybytes.sec10inheritance.p2_upcasting.Dog;

public class P1_DowncastingDemo {

    /*
    Note - Always remember Upcasting and Downcasting of method will happen only in Parent and child class
     */

    public static void main(String[] args) {

        Animal anm;

        Dog dog = new Dog();

        anm = dog; // upcasting or Animal anm = new Dog();

        /*
        // downcasting, we are doing explicitly
        If downcasting is not done explicitly, it will throw a ClassCastException
         */
        Dog dog2 = (Dog) anm;

        dog2.eat(); // Dog is eating

        /*
         below in anm reference var, dog obj is residing and
         we are trying to convert it to a Cat obj i.e. dog obj to cat obj and it will throw ClassCastException
         i,e,  Exception in thread "main" java.lang.ClassCastException:
        class com.easybytes.sec10inheritance.p2_upcasting.Dog cannot be cast to class com.easybytes.sec10inheritance.p2_upcasting.Cat

         */


         Cat cat = (Cat) anm;




    }
}
