package org.coding.string;

public class P9_LongestCommonPrefix {

    /*
    Approach1 -
    - We need to find the longest common prefix and so we will start iteration from back
    - First we will use outer loop to get prefix of first word from back
    - here outer loop will , we will iterate only first word of array
    - then we will use inner loop for complete array of strs to check if each word
      have this prefix or not.
    - If each word have prefix then increase count with 1
    - once for particular prefix if count == strs.length then that means that is the
      largest prefix available in all strings of array.
     */
    public static String longestCommonPrefix(String[] strs) {


        String prefix = "";
        for (int i = strs[0].length() - 1; i >= 0; i--) {

            int count = 0;
            prefix = strs[0].substring(0, i + 1);

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].startsWith(prefix)) {
                    count++;
                }
            }

            if(count == strs.length){
                //System.out.println("Got the prefix - " + prefix);
                return prefix;
            }
        }
        return "";
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        longestCommonPrefix(strs);
    }
}
