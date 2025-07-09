package org.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P2_ArrayListDemo {

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
         * REMOVE ELEMENTS OPERATIONS
         */

        //1. remove element by index i..e remove 0th index element
        namesList.remove(0);
        System.out.println(namesList); // [Brijesh, Pathak, Sunita, Mutthu, Brijesh]

        //2. remove element by Object name and it will remove first occurence of Object in List
        namesList.remove("Brijesh");
        System.out.println("List after remove operation - " + namesList);
        //List after remove operation - [Pathak, Sunita, Mutthu, Brijesh]

        //3. remove if name is Pathak
        namesList.removeIf(name -> name.equals("Pathak"));
        System.out.println(namesList); // [Sunita, Mutthu, Brijesh]

        System.out.println();
        System.out.println();
        ArrayList<String> numsNamesList = new ArrayList<>(List.of("One","Two","Three","Four"));
        numsNamesList.addAll(namesList);
        System.out.println(numsNamesList); // [One, Two, Three, Four, Sunita, Mutthu, Brijesh]

        // numsNamesList have namesList wch have 2 elements Brijesh and Sunita
        //4. I want to delete complete namesList collection from numsNamesList
        numsNamesList.removeAll(namesList);
        System.out.println(numsNamesList); // [One, Two, Three, Four]

        System.out.println();
        // clear() and size()
        System.out.println("numsNamesList size : " + numsNamesList.size());
        // numsNamesList size : 4
        System.out.println();
        numsNamesList.clear();
        System.out.println("numsNamesList size : " + numsNamesList.size());
        // numsNamesList size : 0


    }
}
