package org.coding.arrays.basic;

import java.util.ArrayList;
import java.util.List;

public class P10_ValEqualToIndexVal {

    public List<Integer> valueEqualToIndex(List<Integer> nums) {

        List<Integer> list = new ArrayList<>();

        for(int i =0;i<nums.size();i++){
            if(nums.get(i) == (i+1)){
               list.add(nums.get(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
