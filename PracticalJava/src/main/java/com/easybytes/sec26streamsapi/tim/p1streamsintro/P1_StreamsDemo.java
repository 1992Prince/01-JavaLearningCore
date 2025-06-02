package com.easybytes.sec26streamsapi.tim.p1streamsintro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P1_StreamsDemo {

    public static void main(String[] args) {

        List<String> bingoPool = new ArrayList<>(75);

        int start = 1;

        for (char c : "BINGO".toCharArray()) {
            for (int i = start; i < (start + 15); i++) {
                bingoPool.add("" + c + i);
                //System.out.println("" + c + i);
            }
            start += 15;
        }

        Collections.shuffle(bingoPool);
        for(int i=0;i<15;i++){
           System.out.println(bingoPool.get(i));
        }

        System.out.println("----------------------------------");

        /**
         * Above we have shuffled the bingolist and below we are getting subList from 0 to 15
         * Then we are sorting it and then we are checking is list element starts with O or G
         * then update that element with - and print it
         *
         * Here original list is modified and we printed it
         */
        List<String> firstOnes = bingoPool.subList(0, 15);
        firstOnes.sort(Comparator.naturalOrder());
        // replaceAll accepts Identity Functional Interface
        firstOnes.replaceAll(s -> {
            if(s.indexOf('O') == 0 || s.indexOf('G') == 0){
                String updated = s.charAt(0) + "-" + s.substring(1);
                System.out.print(updated + " ");
                return updated;
            }
            return s;
        });

        System.out.println("\n----------------------------------");
        System.out.println("Above Operations using streams");
        System.out.println("----------------------------------");


        // below we will perform above same operations but using streams and original list will not be modified

        bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('O') == 0 || s.indexOf('G') == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        // printing original bingoPool list and u will see that streams operations haven't modified the original list
        System.out.println();
        System.out.println(bingoPool);

    }
}
