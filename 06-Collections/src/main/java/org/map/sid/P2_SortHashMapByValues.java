package org.map.sid;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class P2_SortHashMapByValues {

    public static void main(String[] args) {

        //  How would you sort a HashMap by its values?

        Map<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("A", 10);
        unsortedMap.put("B", 30);
        unsortedMap.put("C", 20);

        Map<String, Integer> sortedMap = unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new));

        System.out.println("SortedMap - " + sortedMap);



    }
}
