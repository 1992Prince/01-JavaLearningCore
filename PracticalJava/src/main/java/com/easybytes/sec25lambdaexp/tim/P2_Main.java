package com.easybytes.sec25lambdaexp.tim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class P2_Main {

    /*
    Consumer and BiConsumer functional interface demo
     */

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of(
           "alpha", "bravo", "charlie", "delta"
        ));

        // we can iterate it via traditional for loop to print each elemtnt using indexing

        // using enhanced foreach loop
        for(String s: list){
            System.out.print(s + " ");                   // alpha bravo charlie delta
        }

        System.out.println();
        System.out.println();

        // using lambda expression and forEach accepts Consumer functional interface
        // forEach method is default method present in Iterable interface
        list.forEach(s -> System.out.print(s + " "));  // alpha bravo charlie delta

        System.out.println();
        System.out.println();


        List<double[]> coords = Arrays.asList(
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1556, -90.0659});

        // using forEach , will print this each array and forEach accepts Consumer interface
        coords.forEach(s -> System.out.print(Arrays.toString(s) + " "));
        // [47.216, -95.2348] [29.1566, -89.2495] [35.1556, -90.0659]

        System.out.println();
        System.out.println();

        // assignning lambda exp to a variable
        BiConsumer<Double, Double> p1 = (lat, lng) -> System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);

        double[] firstPoint = coords.get(0);
        processPoint(firstPoint[0], firstPoint[1], p1); // [lat:47.216 lon:-95.235]

        System.out.println();
        System.out.println("---------------------------");
        System.out.println();

        coords.forEach(s -> processPoint(s[0], s[1], p1));

        /*
        [lat:47.216 lon:-95.235]
        [lat:29.157 lon:-89.250]
        [lat:35.156 lon:-90.066]
         */
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T,T> consumer){
        consumer.accept(t1, t2);
    }
}
