package com.easybytes.sec20map;

import java.util.HashMap;
import java.util.Map;

public class P1_HashMapDemo {

    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();

        countryMap.put("India", "New Delhi");
        countryMap.put("USA", "Washington DC");
        countryMap.put("UK", "London");
        countryMap.put("France", "Paris");
        countryMap.put(null, null);

        System.out.println("countryMap.get(\"India\") - " + countryMap.get("India")); // countryMap.get("India") - New Delhi
        System.out.println("countryMap.size() - " + countryMap.size());   // countryMap.size() - 5

        countryMap.remove(null);
        System.out.println("countryMap.size() after removing null - " + countryMap.size()); // countryMap.size() after removing null - 4
    }
}
