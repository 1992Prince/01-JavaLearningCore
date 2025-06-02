package com.tim.p2_linkedlists;

import java.util.LinkedList;

public class P1_LinkedListsMeths {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit); // [Canberra, Sydney]

        System.out.println();

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit); // [Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]

        addMoreElements2(placesToVisit);
        System.out.println(placesToVisit); // [Alice Springs, Brisbane, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]

        System.out.println();

        testIterator(placesToVisit);
        System.out.println("Removed Brisbane - " + placesToVisit);
        // Removed Brisbane - [Alice Springs, Darwin, Canberra, Sydney, Hobart, Melbourne, Toowoomba]

        System.out.println();

        testListIterator(placesToVisit);
        System.out.println("ListIter - " + placesToVisit);
        // ListIter - [Alice Springs, Darwin, Lake Wivenhoe, Canberra, Sydney, Hobart, Melbourne, Toowoomba]

        System.out.println();
        // print element from back using ListITerator
        iterateVBackward(placesToVisit); // Toowoomba Melbourne Hobart Sydney Canberra Lake Wivenhoe Darwin Alice Springs


    }

    public static void addMoreElements(LinkedList<String> list){
        /**
         * These methods are present in LinkedList class but not present in ArrayList
         * addFirst() - adds element at the beginning of the list
         * addLast() - adds element at the end of the list
         */
        list.addFirst("Darwin");
        list.addLast("Hobart");

        /**
         * Queue methods
         * offer() - adds element at the end of the list
         * offerLast() - does same thing what offer() method does
         * offerFirst() - adds element at the beginning of the list[same what addFirst() does]
         * poll() - removes the first element from the list
         * remove() - removes the first element from the list
         */
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

    }


    public static void addMoreElements2(LinkedList<String> list){
        // Stack Methods
        list.push("Alice Springs");
    }

    public static void testIterator(LinkedList<String> list){

        var iterator = list.iterator();
        while(iterator.hasNext()){
            String city = iterator.next();
            if(city.equals("Brisbane")){
                iterator.remove();
                // list.remove("Brisbane"); // Exception in thread "main" java.util.ConcurrentModificationException
            }
        }

        /**
         * In above method if u try to remove Brisbane element directly from list like
         * instead of iterator.remove() use list.remove("Brisbane") then it will throw
         * java.util.ConcurrentModificationException
         * We will get same error if we try to remove element while iterating using for loop [enhanced for loop]
         * for(String city : list){
         *     if(city.equals("Brisbane")){
         *         list.remove("Brisbane");
         *     }
         * }
         *
         * Iterator provides a safe way to remove element while iterating through list.
         * so its imp to make sure you're calling remove method on iterator instead on list object
         */
    }

    public static void testListIterator(LinkedList<String> list){

        var iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("Darwin")){
                iterator.add("Lake Wivenhoe");
            }
        }

        /**
         * With ListIterator u can move forward and backward direction both and with ITerator u can only traverse forward
         * ITerator only supports remove but ListIterator supports add, remove, set methods also
         * ListIterator also has previous() method which is not available in Iterator
         *
         * also if u try to use add() method on list instead of listITerator obj then u will get ConcurrentModificationException
         * same way while doing iteration via enhanced for loop if u try to add element to list, u will get ConcurrentModificationException
         */

    }

    public static void iterateVBackward(LinkedList<String> list){
        var iterator = list.listIterator();
        while(iterator.hasNext()){
            iterator.next();
        }

        // now we are end of list iterator, lets traverse backward
        while(iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();
    }
}
