package com.easybytes.sec27optionaljava8;

import java.util.Optional;
import java.util.Random;

public class P2_OptionalDemo {

    /*
    Handling Null Pointer Exception with Optional Class
     */

    public static void main(String[] args) {

        Optional<String> result = sayHi();

        /*
        now we don't need to check obj != null
        below we are using ifPresent() method which returns true if the given object is non-null otherwise it returns false.
        we can also use isEmpty() method instead of !isPresent()
        isEmpty() method returns true if the given Optional object is empty otherwise false.

        result.isPresent() is equivalent to !result.isEmpty()
         */

        if (result.isPresent()) {
            System.out.println(result.get());
        }

    }

    /*
    If we are not sure that null can also be returned then we can use Optional Class
    So we are using Optional return type then we have to return string obj wrapped inside Optional.of()
    and in instead of returning null directly we can return Optional.empty()


    public static Optional<String> sayHi(){
        int num = new Random().nextInt();
        if (num % 2 == 0) {
            return Optional.of("Hi, World");
        }

        return Optional.empty();
    }


    // above code can also be written as below using Optional.ofNullable

 */

    /*
    The Optional.ofNullable() method is a static factory method in the Optional class that is used to create an
    Optional object that may or may not contain a non-null value.

    Below is msz is null object wch is going to happen in case of odd numbers then return type of below will be Empty Optional
    else valid msz object will be wrapped and same will be returned to caller.
     */
    public static Optional<String> sayHi(){
        int num = new Random().nextInt();
        String msz = null;
        if (num % 2 == 0) {
            msz = "Hi, World";
        }

        return Optional.ofNullable(msz);
    }
}
