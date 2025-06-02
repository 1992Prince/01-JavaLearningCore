package com.easybytes.sec26streamsapi.p12terminalopeartions;

import java.util.List;
import java.util.Optional;

public class P15_StreamFindMatchOperationsDemo {

    public static void main(String[] args) {

        List<P15_Item> items = getItems();

        /*
        allMatch () - returns true if all elements match the given predicate, otherwise false
        so if all product items are in stock then true will be returned and if single item is not in stock then
        false will be returned.

        below I will get false bcoz item Headphones is not in stock
         */
        boolean allInStock = items.stream()
                .allMatch(P15_Item::isInStock);

        System.out.println("Are all items in stock? " + allInStock); // false

        System.out.println();

        /*
        anyMatch() - returns true if any element matches the given predicate, otherwise false
        so if any item is in stock then true will be returned
         */

        boolean anyOnStock= items.stream()
                .anyMatch(P15_Item::isInStock);

        /*
        below checks if any item is on sale then true will be returned and if
        all items are not on sale then false will be returned
         */
        boolean anyOnSale= items.stream()
                .anyMatch(P15_Item::isOnSale);

        /*
        below checks if any item is out of stock then true will be returned
         */
        boolean anyOutOfStock= items.stream()
                .anyMatch(item -> !item.isInStock());


        System.out.println("Are any items out of stock? " + anyOutOfStock); // true
        System.out.println("Are any items on sale? " + anyOnSale); // true
        System.out.println("Is any item in stock? " + anyOnStock); // true

        System.out.println();
        System.out.println();

        /*
        check if any item is present in List wch have price greater than 5000
        below if no item  has price greater than 5000 then true will be returned
        and if any item have price grater than 5000 then false will be returned
         */
        boolean isExpensive = items.stream()
                .noneMatch(item -> item.getPrice() > 1000);

        System.out.println("Are any items expensive? " + isExpensive); // false

        System.out.println();
        System.out.println();
        
        /*
        find 1st element from item list which price is greater than 1k
         */

        Optional<P15_Item> firstExpensiveItem = items.stream()
                .filter(item -> item.getPrice() > 1000)
                .findFirst();

        firstExpensiveItem.ifPresent(System.out::println);

        /*
        find any element from item list which price is greater than 1k
         */
        Optional<P15_Item> anyExpensiveItem = items.stream()
                .filter(item -> item.getPrice() > 1000)
                .findAny();

        anyExpensiveItem.ifPresent(System.out::println);




    }

    private static List<P15_Item> getItems() {
        return List.of(
                new P15_Item("Laptop", 1200, true, false),
                new P15_Item("Smartphone", 800, true, true),
                new P15_Item("Headphones", 150, false, true),
                new P15_Item("Camera", 2000, true, true),
                new P15_Item("Smartwatch", 300, true, false)
        );
    }
}
