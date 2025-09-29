package org.optional;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

public class P2_Demo {

    public static void main(String[] args) {

        // of() - Used for putting a value/instance inside Optional Container

        Optional<String> optionalStringObj = Optional.of("Java lang demo");
        String strVal = optionalStringObj.get();

        // ⚠️ Optional.of(null) ❌ NPE throw karega

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

        if(result2.isEmpty()){
            System.out.println("result2 value is empty");
        }
        // result2 value is empty

        System.out.println();

        Optional<String> pikaName = getNameUpperCase("Pikachu");

        if(pikaName.isPresent()){
            System.out.println("pikaName.isPresent() - " + pikaName.get());
        }

        Optional<String> nullName = getNameUpperCase(null);
        //System.out.println("nullName - " + nullName.get()); // throw NPE

        if(nullName.isEmpty()){
            System.out.println("nullName is NULL");
        }
        // nullName is NULL

    }

    public Optional<String> getValue(){

        return Optional.of("Dilip IT Academy");
    }

    public Optional<String> getValue2(){

        //below instead of returning null, return empty
        //return Optional.of(null);

        return Optional.empty();
    }

    public static Optional<String> getNameUpperCase(String name){

        String namestr = name;
        Optional<String> value = null;

        if(Objects.isNull(namestr)){
            value = Optional.empty();
        }else{
            value = Optional.of(namestr.toUpperCase());
        }

        return value;


    }
}
