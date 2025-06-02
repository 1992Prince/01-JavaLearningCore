package com.easybytes.sec26streamsapi.p5_flatmapdemo;

import java.util.Arrays;
import java.util.stream.Stream;

public class P5_FlatMapIntermediateOperation {

    public static void main(String[] args) {

       String[] strArr = {"Easy", "Bytes"};

        Stream<String> streamObj = Arrays.stream(strArr);

        /*
        .map(var -> var.split("")) will make Easy Bytes to
        String[] = {'E','a','s','y'}
        String[] = {'B','y','t','e','s'}

        now we can't use terminal operation directly over this
        if u use like below then 2 STring array object names wll be printed

        streamObj.map(var -> var.split(""))
                .forEach(System.out::println);

                output
                [Ljava.lang.String;@723279cf
                [Ljava.lang.String;@10f87f48

                So we need to flat this frst then can use terminal operation

         */

        streamObj.map(var -> var.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::println);

        /*
        E
        a
        s
        y
        B
        y
        t
        e
        s
         */
    }
}
