package org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P5_ArrayToList2 {

    public static void main(String[] args) {

        /**
         * Arrays.asList(arrayVariable) vs Arrays.asList(1,2,3,4,5)
         *
         * Case 1: Arrays.asList(arrayVariable)
         *      Integer[] intArray = {1, 2, 3, 4};
         *      List<Integer> list1 = Arrays.asList(intArray);
         *
         *      - Yahan hum ek array pass kar rahe hain.
         *      - Arrays.asList() us array ko wrap karke ek fixed-size list banata hai.
         *      - List ke elements array ke elements hote hain.
         *      - Agar aap array me element change karoge, list me bhi reflect hoga (aur vice versa).
         *
         * Case 2: Arrays.asList(1, 2, 3, 4)
         *
         *   List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
         *
         * Yahan hum varargs (multiple arguments) pass kar rahe hain.
         * Java internally isko ek array banata hai behind the scenes: new Integer[]{1, 2, 3, 4}
         * Fir same tarah se list banata hai — fixed-size list, lekin yeh array internally method ke andar banta hai (aapka apna array nahi hota).
         * Is case me aapke paas original array ka reference nahi hota, toh list ke changes kisi external array me reflect nahi honge.
         *
         * NOTE:
         * If u have existing array and u want to make List from it, then u can use Arrays.asList(arrVariable)
         * but if u just want to create list with some elements and there is not array avaiable then u can use:
         *      List<Integer> list2 = Arrays.asList(1, 2, 3, 4); or
         *      List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
         *
         *      in list2 u can't do any add or remove operation but can do set Operation
         *      for add and remove operation u will get UnsupportedOperationException
         *
         *      list3 is modifiable ArrayList and u can do all operations like add, remove etc.
         */

        /**
         * Use cases of Arrays.asList(1, 2, 3, 4)
         *
         * - Quick fixed-size list for read-only use
         *      Jab tumhe ek chhoti, constant values wali list chahiye jo modify nahi hogi.
         *      private static final List<String> DAYS = Arrays.asList("Mon", "Tue", "Wed");
         *      Yahan tum bas read karoge, modify nahi karoge.
         *
         * - Passing values directly to a method
         *   Jab tumhe method ko ek list pass karni ho, aur tumhe array banane ka extra step nahi chahiye.
         *   processList(Arrays.asList(1, 2, 3, 4));
         *
         * - Temporary list in testing or examples
         *   Unit tests me data setup karte waqt quick list banana.
         *   List<Integer> numbers = Arrays.asList(10, 20, 30);
         *   assertEquals(3, numbers.size());
         *
         * - But limitation:
         *   Fixed size → add() ya remove() call karoge toh UnsupportedOperationException milega.
         *   Ye internally ek array-backed list hai, so structure change nahi hota.
         *
         *
         *
         *  If you want a modifiable list from values directly:
         *  Use:
         *
         *          List<Integer> modifiableList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
         *          modifiableList.add(5); // works fine
         */
    }
}
