package com.easybytes.sec17listAndArrayLists.basicoperations;

import java.util.ArrayList;

public class P3_ArrayListCapacityAndIteration {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");

        // ensureCapacity(int minCapacity)
        list.ensureCapacity(20);
        System.out.println("After ensuring capacity: " + list);
        // Output: [Apple, Banana, Cherry, Apple]

        // forEach(Consumer<? super E> action)
        System.out.print("Elements using forEach: ");
        list.forEach(fruit -> System.out.print(fruit + " "));
        System.out.println();
        // Output: Apple Banana Cherry Apple

        // indexOf(Object O)
        int index = list.indexOf("Banana");
        System.out.println("Index of 'Banana': " + index);
        // Output: 1

        // isEmpty()
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
        // Output: false

        // lastIndexOf(Object O)
        int lastIndex = list.lastIndexOf("Apple");
        System.out.println("Last index of 'Apple': " + lastIndex);
        // Output: 3

        // listIterator() and listIterator(int index)
        System.out.print("Iterating with listIterator from index 1: ");
        list.listIterator(1).forEachRemaining(System.out::print);
        System.out.println();
        // Output: BananaCherryApple
    }
}
