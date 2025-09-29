package org.map.sid;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class P3_FindOccurencesOfElementInArray {

    public static void main(String[] args) {

        //  Java Program to Find Occurrences of Elements in an Array

        // Example array
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(frequencyMap);

        // {1=1, 2=2, 3=1, 4=3, 5=1}




    }
}
