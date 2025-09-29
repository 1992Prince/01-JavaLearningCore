package org.coding.arrays.easy;

public class P4_EquilibriumIdx {

    static int findEquilibrium(int arr[]) {
        int totalsum = 0;
        for(int num: arr){
            totalsum += num;
        }

        int leftSum = 0;
        for(int i=0;i<arr.length;i++){

            int rightSum = totalsum - leftSum - arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 0, 3};
        System.out.println(findEquilibrium(arr1));

        System.out.println();

        int[] arr2 = {1,1,1,1};
        System.out.println(findEquilibrium(arr2));

        System.out.println();

        int[] arr3 = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(findEquilibrium(arr3));

    }
}
