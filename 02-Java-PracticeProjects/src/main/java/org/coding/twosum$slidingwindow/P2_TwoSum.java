package org.coding.twosum$slidingwindow;

import java.util.Arrays;
import java.util.HashMap;

public class P2_TwoSum {

    /*
    Here in problem it is specified that each input have only one solution
    so we don't need to think about any edge cases like if no two elements have sum target etc.

    https://leetcode.com/problems/two-sum/description/

    Below is Brute Force approach and its complexity are -
    Time complexity  - O(n²)
    Space complexity - O(1)
     */
    public static int[] twoSum(int[] nums, int target) {

        int[] arr = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    /*
    Better Approach -
    - iterate nums array and keep each element and its index in map obj
    - here I am assuming each element comes only once in nums array[WRONG ASSUMPTION]
      here same element can comes multiple times and in map latest key index will be updated [REFER 3rd example]
    - again iterate the nums array and do target - nums[i] = val and
      search val in map. If it exists then this is pair and if not then i will increment

    SPECIAL CASE[RETURNING SAME ELEMENT INDEX]
    - suppose if nums arr is = [3,2,4] so map will be {(3,0),(2,1),(4,1)}
    - and target is 6 , as per above steps => 6 - 3 = 3 and then 3 wll be searched
      in map and map do have 3 and so it will return same element index i.e. [0,0]
      and ths is not solution[TO AVOID IT WE NEED TO ADD ADDITIONAL CHECK]

    - val = target - nums[i], check if val is present in map and if yes then
      then index of it in array should not be equal to value of it in map

    - don't put condition that map should not contains val as key bcoz , nums
      array can have same element in diff indexes[REFER 3rd example arr]

    - Here we are using 2 for loops i.e. O(n) + O(n) = O(n)
      and searching in map is O(1) i.e. constant time so overall = O(n) + O(1) = O(n)

      Space Complexity = O(n)

     */
    public static int[] twoSum2(int[] nums, int target) {

        int[] arr = {-1, -1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        //System.out.println(map);

        for (int i = 0; i < nums.length; i++) {
            int val = target - nums[i];
            if(map.containsKey(val) && i != map.get(val)){
                arr[0] = i;
                arr[1] = map.get(val);
                break;
            }
        }

        return arr;
    }


    public static void main(String[] args) {

        int[] arr1 = {2, 7, 11, 15};
        int[] arr2 = {3, 2, 4};
        int[] arr3 = {3, 3};

        System.out.println(Arrays.toString(twoSum(arr1, 9)));
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
        System.out.println(Arrays.toString(twoSum(arr3, 6)));

        System.out.println();
        System.out.println();

        System.out.println(Arrays.toString(twoSum2(arr1, 9)));
        System.out.println(Arrays.toString(twoSum2(arr2, 6)));
        System.out.println(Arrays.toString(twoSum2(arr3, 6)));

    }
}
