package org.coding.string;

public class P8_LargestOddNoInString {

    /*
    Approach1-
    We need to find largest odd number from given num and it should be substring
    - Frm given String we can get largest odd no from back of it, so we will iterate from Right to Left
    - then we will fetch each character num -> convert it into int and check if it is odd
    - if yes and that index of that num is not 0 then use substring method to return that substring
    - and if index s 0 then return that num
     */
    public static String largestOddNumber(String num) {


        for (int i = num.length() - 1; i >= 0; i--) {
            int val = Integer.valueOf(String.valueOf(num.charAt(i)));
            if(val % 2 != 0){
                if(i != 0){
                    return num.substring(0, i+1);
                }else{
                    return String.valueOf(num.charAt(0));
                }
            }
        }
        return "";
    }

    public static void main(String[] args) {

        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
        System.out.println(largestOddNumber("354272"));

    }
}
