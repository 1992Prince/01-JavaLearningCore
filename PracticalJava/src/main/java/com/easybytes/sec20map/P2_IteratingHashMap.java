package com.easybytes.sec20map;

import java.util.*;

public class P2_IteratingHashMap {

    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington DC");
        countryMap.put("UK", "London");
        countryMap.put("France", "Paris");
        countryMap.put(null, null);

        approach1(countryMap);

    }

    public static void approach1(Map<String, String> countryMap){

        /**
         * Iterating all keys of HashMap
         */

        Set<String> countryKeySet = countryMap.keySet();
        for(String country : countryKeySet){
            System.out.print(country + " " + countryMap.get(country) + " , ");   // null null , USA Washington DC , UK London , France Paris , India New Delhi ,

        }

        System.out.println();
        System.out.println();

        /**
         * Iterating all values of HashMap
         */
        Collection<String> countryValues = countryMap.values();
        for(String capital : countryValues){
            System.out.print(capital + " ");  // null Washington DC London Paris New Delhi
        }

        System.out.println();
        System.out.println();

        /**
         * Iterating all keys and values of HashMap
         */
        Set<Map.Entry<String, String>> countryEntrySet = countryMap.entrySet();
        for(Map.Entry<String, String> entry : countryMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /**
         * null : null
         * USA : Washington DC
         * UK : London
         * France : Paris
         * India : New Delhi
         */

        System.out.println();
        System.out.println();

        /**
         * Using Iterator
         * We can't invoke iterator directly on Map
         * We need to invoke it on Set
         */
        Set<String> countryKeySet2 = countryMap.keySet();
        Iterator<String> iterator = countryKeySet2.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.print(key + " ");   // null USA UK France India
        }

        System.out.println();
        System.out.println();

    }
}
