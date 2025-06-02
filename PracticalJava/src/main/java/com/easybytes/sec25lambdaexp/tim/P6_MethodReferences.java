package com.easybytes.sec25lambdaexp.tim;

import java.util.Arrays;
import java.util.function.Supplier;

class PlainOld{

    private static int last_id = 1;
    private int id;
    public PlainOld() {
        id = last_id++;
        System.out.println("Creating a PlainOld Object id - " + id);
    }
}
public class P6_MethodReferences {

    public static void main(String[] args) {

        Supplier<PlainOld> ref1 = () -> new PlainOld();
        /*
         above can be replaced by Method reference

         This method reference is a special type, a constructor method reference.
         */
        Supplier<PlainOld> ref2 = PlainOld::new;

        PlainOld obj1 = ref2.get(); // Creating a PlainOld Object id - 1

        System.out.println("Getting Aray");
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);
    }

    private static PlainOld[] seedArray(Supplier<PlainOld> ref, int count){
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, i -> ref.get());
        return array;
    }
}
