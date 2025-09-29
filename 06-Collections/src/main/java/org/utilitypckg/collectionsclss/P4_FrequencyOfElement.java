package org.utilitypckg.collectionsclss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P4_FrequencyOfElement {


    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 1, 3, 9, 5, 1, 9, 9, 9, 1));
        int freq_9 = Collections.frequency(list1,9);
        int freq_5 = Collections.frequency(list1,5);
        int freq_1 = Collections.frequency(list1,1);
        int freq_3 = Collections.frequency(list1,3);
        int freq_2 = Collections.frequency(list1,2);

        System.out.println("freq_9 - " + freq_9); // freq_9 - 4
        System.out.println("freq_5 - " + freq_5); // freq_5 - 2
        System.out.println("freq_1 - " + freq_1); // freq_1 - 3
        System.out.println("freq_3 - " + freq_3); // freq_3 - 1
        System.out.println("freq_2 - " + freq_2); // freq_2 - 0

    }
}
