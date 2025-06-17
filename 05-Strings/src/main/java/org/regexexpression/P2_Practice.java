package org.regexexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P2_Practice {

    public static void main(String[] args) {

        String input = "Java is fun";
        Pattern pattern = Pattern.compile("Java");
        // now we need to check if input contains given pattern
        Matcher matcher = pattern.matcher(input);
        // here it is checking if given input is matching with pattern or not
        System.out.println(matcher.find()); // true
    }
}
