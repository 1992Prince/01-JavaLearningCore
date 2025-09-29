package org.map.sid;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class P6_LoopMapWithEntrySet {

    /**
     * In Java, the Map interface provides the entrySet() method to efficiently iterate
     * through key-value pairs. The entrySet() method returns a Set of Map.Entry objects,
     * where each Map.Entry represents a key-value pair in the map.
     * <p>
     * Using entrySet() is particularly useful when you need to work with both keys and
     * values simultaneously during iteration
     *
     * Allows you to update the map’s values during iteration (e.g., modifying entry.setValue()).
     *
     * Best Practices:
     * Use entrySet() when both keys and values are needed during iteration.
     * Use keySet() if you only need keys, and values() if only values are required.
     */
    public static void main(String[] args) {

        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 92);
        studentScores.put("Charlie", 78);

        Set<Map.Entry<String, Integer>> stuEntrySet = studentScores.entrySet();

        for (Map.Entry<String, Integer> entry : stuEntrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        /**
         * Bob 92
         * Alice 85
         * Charlie 78
         */


    }
}
