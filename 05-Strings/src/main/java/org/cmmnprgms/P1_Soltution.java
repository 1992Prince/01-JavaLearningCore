package org.cmmnprgms;

import java.util.HashMap;
import java.util.Map;

public class P1_Soltution {

    static void findDuplicateWordsWithOccurences(String str){

        String[] arr = str.split(" ");
        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i]) + 1);
            }else{
                map.put(arr[i], 1);
            }
        }

        for( Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

    }

    public static void main(String[] args) {

        String str1 = "Java is great. Java is powerful. Java is simple and powerful.";

        findDuplicateWordsWithOccurences(str1);

        /**
         * Java - 3
         * is - 3
         * powerful. - 2
         */


    }
}
