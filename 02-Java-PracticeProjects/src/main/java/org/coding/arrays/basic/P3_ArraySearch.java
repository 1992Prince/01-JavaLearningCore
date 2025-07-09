package org.coding.arrays.basic;

public class P3_ArraySearch {
    static int search(int arr[], int x) {

        for(int i = 0;i<arr.length;i++){
            if(x == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
