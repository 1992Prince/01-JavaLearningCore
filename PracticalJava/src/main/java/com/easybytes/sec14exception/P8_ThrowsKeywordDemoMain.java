package com.easybytes.sec14exception;

public class P8_ThrowsKeywordDemoMain {

    public static void main(String[] args) {

        try{
            double value = P8_ThrowsKeywordDemo.division("four", "5");
            // below will throw NumberFormatException
            //double value = P8_ThrowsKeywordDemo.division("four", "5");
            // below will throw ArithmeticException
            //double value = P8_ThrowsKeywordDemo.division("9", "0");
        } catch (NumberFormatException | ArithmeticException ex){
            System.out.println("Invalid data provided. Pls provide correct inputs");
            ex.printStackTrace();
        }
    }
}
