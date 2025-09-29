package org.utilitypckg.collectionsclss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P3_MinMax {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>(Arrays.asList(5, 1, 3, 9));
        int max = Collections.max(list1);
        int min = Collections.min(list1);
        System.out.println("Max - " + max + " Min - " + min); // Max - 9 Min - 1
    }
}
