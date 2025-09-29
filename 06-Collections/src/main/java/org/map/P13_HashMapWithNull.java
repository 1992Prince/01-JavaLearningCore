package org.map;

import java.util.HashMap;
import java.util.Map;

public class P13_HashMapWithNull {

    /**
     * HashMap can have only one null key and multiple null values
     * We can't have more than one null key in one HashMap
     */
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(null, "Rahul");
        map.put(10,null);
        map.put(12,null);
        map.put(20,"Kwright");
        System.out.println(map); // {null=Rahul, 20=Kwright, 10=null, 12=null}
        System.out.println();


        // It will update the previous null value and will not add additional
        // also adding multiple null keys will not give compile time error but will update the
        // previous null value with latest value

        map.put(null, "Singham");
        System.out.println(map); // {null=Singham, 20=Kwright, 10=null, 12=null}
        System.out.println();

    }
}
