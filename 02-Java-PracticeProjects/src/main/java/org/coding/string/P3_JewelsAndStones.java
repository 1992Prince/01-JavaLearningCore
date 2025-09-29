package org.coding.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P3_JewelsAndStones {

    /**
     *Approach1 - Brute Force
     * convert jewels and stones string into charArray
     * Now iterate each element of stones array and check if it s matching with jewels array elements
     * if matching then increase the count and come out of inner loop.
     *
     * But time complexity is - O(n*m)
     * space complexity = O(1)
     */
    public static int numJewelsInStones(String jewels, String stones) {

        char[] stonesArr = stones.toCharArray();
        char[] jwlsArr = jewels.toCharArray();

        int count = 0;
        for (int i = 0; i < stonesArr.length; i++) {
            for(int j=0;j<jwlsArr.length;j++){
                if(stonesArr[i] == jwlsArr[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    /*
    Approach2 - Optimized
    when we search an element in string or in an array then our Time complexity is = O(n)
    bcoz we check each element of string or array

    But if we use set or map and search element in it then Time complexity will be = O(1)
    Java set iternally uses map and map stores element on hashing based.
    And searching element TC is O(1)

    So to optimize above solution u can convert jewels array into set and iterate each
    element of stones via for loop and search in set instead of using inner loop.
    Now T.C will be = O(n) * O(1) = O(n)

    So first convert charArr into HashSet array using foreach loop or java streams
    using foreach loop
    char[] chars = {'a', 'b', 'c'};
    Set<Character> set = new HashSet<>();

    for (char ch : chars) {
        set.add(ch);  // Autoboxing to Character
    }
     */

    public static int numJewelsInStones2(String jewels, String stones) {

        char[] stonesArr = stones.toCharArray();
        char[] jwlsArr = jewels.toCharArray();

        Set<Character> set = new HashSet<>();
        for(char c: jwlsArr){
            set.add(c);
        }


        int count = 0;
        for (int i = 0; i < stonesArr.length; i++) {
            if(set.contains(stonesArr[i])){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z","ZZ"));

        System.out.println();

        System.out.println(numJewelsInStones2("aA","aAAbbbb"));
        System.out.println(numJewelsInStones2("z","ZZ"));

    }
}
