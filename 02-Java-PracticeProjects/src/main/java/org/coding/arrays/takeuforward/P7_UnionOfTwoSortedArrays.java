package org.coding.arrays.takeuforward;

import java.util.ArrayList;
import java.util.List;

public class P7_UnionOfTwoSortedArrays {

    static List<Integer> union(int[] arr1, int[] arr2) {

        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;

        List<Integer> result = new ArrayList<>();

        // Case 1, 2, 3: Traverse both arrays
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    result.add(arr1[i]);
                }
                i++;
            }else if (arr1[i] > arr2[j]) {
                if (j == 0 || arr2[j] != arr2[j - 1]) {
                    result.add(arr2[j]);
                }
                j++;
            }else { // arr1[i] == arr2[j]
                if (i == 0 || arr1[i] != arr1[i - 1]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        //  Case: Remaining elements in arr1 [arr2 iteration is over and arr1 length is > arr2]
        while (i < n) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                result.add(arr1[i]);
            }
            i++;
        }

        //  Case: Remaining elements in arr2 [arr1 iteration is over and arr2 length is > arr1]
        while (j < m) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 5};
        int[] arr2 = {2, 3, 4, 5, 6};

        List<Integer> unionArr = union(arr1, arr2);
        System.out.println("Union of Arrays: " + unionArr);
    }
}
