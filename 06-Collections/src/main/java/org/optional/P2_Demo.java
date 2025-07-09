package org.optional;

import java.util.ArrayList;
import java.util.Optional;

public class P2_Demo {

    public static void main(String[] args) {

        // of() - Used for putting a value/instance inside Optional Container

        Optional<String> optionalStringObj = Optional.of("Java lang demo");

        Optional<Integer> optionalIntegerObj = Optional.of(1234);

        ArrayList<String> names = new ArrayList<>();
        names.add("Java Land Demo");
        names.add("Optional");

        Optional<ArrayList<String>> optionalListObj = Optional.of(names);

        System.out.println();

        P2_Demo demo = new P2_Demo();
        Optional<String> result = demo.getValue();
        System.out.println(result.get().toUpperCase()); // DILIP IT ACADEMY
        System.out.println();

        Optional<String> result2 = demo.getValue2();
        if(result2.isPresent()){
            System.out.println("Value is present - " + result2.get());
        }



    }

    public Optional<String> getValue(){

        return Optional.of("Dilip IT Academy");
    }

    public Optional<String> getValue2(){

        //below instead of returning null, return empty
        //return Optional.of(null);

        return Optional.empty();
    }
}
