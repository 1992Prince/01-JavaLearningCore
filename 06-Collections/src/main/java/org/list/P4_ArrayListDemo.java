package org.list;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P4_ArrayListDemo {

    public static void main(String[] args) {


        List<String> namesList = new ArrayList<>();

        namesList.add("Arun");
        namesList.add("Brijesh");
        namesList.add("Pathak");
        namesList.add("Sunita");
        namesList.add("Mutthu");
        namesList.add("Brijesh");
        System.out.println(namesList); // [Arun, Brijesh, Pathak, Sunita, Mutthu, Brijesh]

        /**
         * SEARCH A VALUE IS AVAILABLE OR NOT IN LIST
         */

        boolean isBrijeshPresent = namesList.contains("Brijesh");
        boolean isAnoupPresent = namesList.contains("Anoup");
        System.out.println("isBrijeshPresent : " + isBrijeshPresent);
        System.out.println("isAnoupPresent : " + isAnoupPresent);

        /**
         * isBrijeshPresent : true
         * isAnoupPresent : false
         */

        /**
         * SEARCH IF GIVEN COLLECTION IS PRESENT
         */

        ArrayList<String> list1 = new ArrayList<>(List.of("apple","pikachu"));
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1,2,3));
        System.out.println("Before Modified List : " +namesList);
        // Before Modified List : [Arun, Brijesh, Pathak, Sunita, Mutthu, Brijesh]
        namesList.addAll(2,list1);
        System.out.println("Modified List : " +namesList);
        // Modified List : [Arun, Brijesh, apple, pikachu, Pathak, Sunita, Mutthu, Brijesh]

        // CHECK IF COLLECTION  LIST1 AND LIST2 ARE PRESENT IN NAMESLIST
        boolean list1Check = namesList.containsAll(list1);
        boolean list2Check = namesList.containsAll(list2);
        System.out.println(list1Check +" " + list2Check); // true false
        System.out.println();

        /**
         * INDEXOF vs LASTINDEXOF Methods
         * INDEXOF will return the first occurence object index in list
         * LASTINDEXOF will return the last index of object occurence in list
         * if element/object is not present in it will return -1
         *
         */
        int idx0 = namesList.indexOf("Brijest");
        int idx1 = namesList.indexOf("Brijesh");
        int idx2 = namesList.lastIndexOf("Brijesh");
        System.out.println(idx0 + " " + idx1 + " " + idx2); // -1 1 7
        System.out.println();

        /**
         * subList(firstidx,lastidx) - lastidx is non-inclusive
         */
        System.out.println(namesList);
        // [Arun, Brijesh, apple, pikachu, Pathak, Sunita, Mutthu, Brijesh]
        List<String> namessublist1 = namesList.subList(1, 5);
        List<String> namessublist2 = namesList.subList(1,namesList.size());
        System.out.println("namessublist1 - " + namessublist1);
        // namessublist1 - [Brijesh, apple, pikachu, Pathak]
        System.out.println("namessublist2 - " + namessublist2);
        // namessublist2 - [Brijesh, apple, pikachu, Pathak, Sunita, Mutthu, Brijesh]

        // List<String> namessublist3 = namesList.subList(1,namesList.size()+1); // will throw  Exception in thread "main" java.lang.IndexOutOfBoundsException


        System.out.println();
        /**
         * ISEMPTY - check is arraylist is empty or not
         * ISEMPTY is same as list.size() == 0
         */
        System.out.println("ISEMPTY? - " + namesList.isEmpty()); // ISEMPTY? - false
        System.out.println();

        /**
         * CONVERT ARRAYLIST TO ARRAY
         * ArrayList.toArray() - Converts the list into a generic Object[] array.
         * ✅ Syntax 1: toArray() -> Object[] arr = list.toArray();
         *      - This version returns an array of type Object[].
         *      - It's safe and works regardless of what type your ArrayList contains, but:
         *      - You’ll have to cast individual elements if you want them as a specific type like String.
         *
         * 🔹 Use Case
         * Use this when:
         * - You don't care about the type of the array.
         * - You're just iterating or printing.
         * - You want to handle the array as Object[].
         */

        ArrayList<String> namesList3 = new ArrayList<>();
        namesList3.add("Arun");
        namesList3.add("Brijesh");
        namesList3.add("Pikachu");

        Object[] arr = namesList3.toArray(); // Returns Object[]

        System.out.println("Using Object[]:");
        for (Object obj : arr) {
            System.out.print((String)obj + " "); // Needs casting to String // OUTPUT - Arun Brijesh Pikachu
        }

        System.out.println();

        /**
         * ✅ 2. toArray(T[] a) — Generic Version
         * syntax - public <T> T[] toArray(T[] a)
         *
         * 🔹 What it does
         * - Converts the list into an array of the specified type.
         * - Returns an array of the same type and runtime type as the passed-in array.
         *
         * 🔹 Use Case
         * Use this when:
         * - You want to convert your ArrayList<T> into a T[] (e.g., String[]).
         * - You want to avoid casting.
         * - You need type safety.
         */

        ArrayList<String> namesList4 = new ArrayList<>();
        namesList4.add("Arun");
        namesList4.add("Brijesh");
        namesList4.add("Pikachu");

        // Convert to String[]

        String[] strArr = namesList4.toArray(new String[0]);

        System.out.println();
        System.out.println("Using String[]:");
        for (String name : strArr) {
            System.out.print(name + " "); // No casting needed // OUTPUT- Arun Brijesh Pikachu
        }
        System.out.println();




        //pending -  stream, sort, equals,





    }
}
