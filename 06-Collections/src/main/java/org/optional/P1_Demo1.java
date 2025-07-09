package org.optional;

public class P1_Demo1 {

    public static void main(String[] args) {

        P1_Demo1 demo = new P1_Demo1();
        String result = demo.getValue();
        System.out.println(result.toUpperCase());
        System.out.println();

        String result2 = demo.getValue2();
        //System.out.println(result2.toUpperCase()); // this line will throw NullPointerException // we need to do null checks
        if(result2 != null){
            System.out.println(result2.toUpperCase());
        }else{
            System.out.println("Result2 have null value");
        }
        System.out.println();



    }

    public String getValue(){

        return "Dilip IT Academy";
    }

    public String getValue2(){

        return null;
    }

}
