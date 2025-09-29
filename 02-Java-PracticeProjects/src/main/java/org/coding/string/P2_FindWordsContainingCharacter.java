package org.coding.string;

import java.util.ArrayList;
import java.util.List;

public class P2_FindWordsContainingCharacter {

    /*
    Approach1 - very stratight forward
     */
    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ll = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) {
                ll.add(i);
            }
        }
        return ll;
    }

    /*
    But interviewer can ask you not to use built-in method here like contains() don't use
    Approach2 - without using contains() or any built-in method
                Here we will iterate array and will fetch each word charcter and compare it
                and if matches then add it to list and break the loop

    Note - we can't fetch string character via str[0] or str[i]
           we need to use charAt() method
           ✅ In Java, you cannot use str[0] to access a character in a string because:
           🔸 Strings are not arrays in Java — they are objects of the String class.
           So str[0] will give a compilation error like:

     */

    public static List<Integer> findWordsContaining2(String[] words, char x) {

        List<Integer> ll = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(words[i].charAt(j) == x){
                    ll.add(i);
                    break;
                }
            }
        }
        return ll;
    }

    public static void main(String[] args) {

        String[] words1 = {"leet", "code"};
        String[] words2 = {"abc", "bcd", "aaaa", "cbc"};


        System.out.println(findWordsContaining(words1, 'e'));
        System.out.println(findWordsContaining(words2, 'a'));
        System.out.println(findWordsContaining(words2, 'z'));
        System.out.println();

        System.out.println(findWordsContaining2(words1, 'e'));
        System.out.println(findWordsContaining2(words2, 'a'));
        System.out.println(findWordsContaining2(words2, 'z'));
    }
}
