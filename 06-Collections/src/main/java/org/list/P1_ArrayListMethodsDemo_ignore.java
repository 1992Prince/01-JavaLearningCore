package org.list;

import java.util.ArrayList;
import java.util.List;

public class P1_ArrayListMethodsDemo_ignore {

    public static void main(String[] args) {

        /**
         * ArrayList have 3 constructors
         * -------------------------------
         * ArrayList()                          - Constructs an empty list with an initial capacity of ten.
         * ArrayList(int initialCapacity)       - Constructs an empty list with the specified initial capacity.
         * ArrayList(Collection<? extends E> c) - Constructs a list containing the elements of the specified collection,
         *                                        in the order they are returned by the collection's iterator.
         *
         */

        // Req - Collect names of Persons
        // below will create an arraylist of initial capacity 10
        List<String> namesList = new ArrayList<>();

        /**
         * add operations -
         *
         * For add operations, ArrayList have 4 add methods
         * 1) void add(int index, E element) - Inserts the specified element at the specified position in this list.
         * 2) boolean add(E e)               - Appends the specified element to the end of this list.
         * 3) boolean addAll(int index, Collection<? extends E> c)  - Inserts all of the elements in the specified collection into this list, starting at the specified position.
         * 4) boolean addAll(Collection<? extends E> c)  - Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
         *
         *
         */

        // adding values - add(Object)
        namesList.add("Arun");
        namesList.add("Brijesh");
        namesList.add("Pathak");
        namesList.add("Sunita");
        namesList.add("Mutthu");


        System.out.println(namesList); // [Arun, Brijesh, Pathak, Sunita, Mutthu]


    }
}
