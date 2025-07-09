package org.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P1_ArrayListDemo {

    public static void main(String[] args) {

        /**
         * ArrayList have 3 constructors
         * -------------------------------
         * ArrayList()                          - Constructs an empty list with an initial capacity of 10.
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
        namesList.add("Mutthu");                  // adds element at last of list
        namesList.add(3, "Chahar"); // adds element at particular index
        System.out.println("NamesList - " + namesList);
        System.out.println();
        // NamesList - [Arun, Brijesh, Pathak, Chahar, Sunita, Mutthu]

        /**
         * Adding another collection at particular index
         */
        ArrayList<String> fruitsList = new ArrayList<>(List.of("apple","banana"));
        namesList.addAll(1,fruitsList);
        System.out.println(namesList);
        // [Arun, apple, banana, Brijesh, Pathak, Chahar, Sunita, Mutthu]
        System.out.println();

        /**
         * Adding another collection at last of element
         */
        namesList.addAll(fruitsList);
        System.out.println(namesList);
        // [Arun, apple, banana, Brijesh, Pathak, Chahar, Sunita, Mutthu, apple, banana]
        System.out.println();

        System.out.println("----------ADD OPERATION OVER------------------");
        System.out.println("----------ITERATION OPERATION-----------------");
        System.out.println();




        // get the values - get(idx)
        String name = namesList.get(4);
        System.out.println("Name - " + name); // Name - Pathak

        //---------------------------------------------------------------------------------

        // get size of ArrayList - size()
        // Array will throw  ArraysIndexOutOfBoundExceptions, if u try to access arr.length index element
        // In ArrayList , index more than length will give IndexOutOfBoundException

        // print all values[ArrayList iteration] - for loop and for each loop

        // using for loop
        for(int i=0;i<namesList.size();i++){
            System.out.print(namesList.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        // using for-each loop
        for(String ele: namesList){
            System.out.print(ele+" ");
        }

        System.out.println();
        System.out.println();
        System.out.println("---------Lets add and remove elements from ArrayList while iterating it via for-each loop---------------");
        System.out.println();

        /**
         * While using for or for each loop, u can't add or remove element to ArrayList
         * It will throw ConcurrentModificationException.
         * Since u r changing the structure of ArrayList
         */


            /*for(String ele: namesList){
                if(ele.equals("Arun")){
                    namesList.add("Abhinav"); // Exception in thread "main" java.util.ConcurrentModificationException
                }
            }*/



        // trying to remove object during for each loop

           /* for(String ele: namesList){
                if(ele.equals("Arun")){
                    namesList.remove(ele); // Exception in thread "main" java.util.ConcurrentModificationException
                }
            }*/


        /**
         * But u can update existing elements in ArrayList using set() method
         * set() is not a structural modification
         * Java only throws ConcurrentModificationException when:
         * You structurally modify the list's size (e.g., using .add(), .remove()), while iterating using an iterator (like in for-each).
         * But set(int index, value) only replaces the element at that index. It doesn't change the size.
         */


        for(String ele: namesList){
            if(ele.equals("Arun")){
                namesList.set(1,"Pikachu");
            }
        }

        System.out.println("After set() Modification - " + namesList);
        // [Arun, Pikachu, banana, Brijesh, Pathak, Chahar, Sunita, Mutthu, apple, banana]
        System.out.println();


        //---------------------------Iterating ArrayList via iterator------------------------------------------------------

        // we can use iterator also

        Iterator<String> namesItr = namesList.iterator();
        while(namesItr.hasNext()){
            String ele = namesItr.next();
            System.out.print(ele + " ");
        }
        // Arun Pikachu banana Brijesh Pathak Chahar Sunita Mutthu apple banana
        System.out.println();

        System.out.println("----------ITERATION VIA FOREACH-------------");
        // forEach() is added from jdk 1.8 version
        //namesList.forEach(ele -> System.out.print(ele));
        namesList.forEach(System.out::print);
        // ArunPikachubananaBrijeshPathakChaharSunitaMutthuapplebanana


    }
}
