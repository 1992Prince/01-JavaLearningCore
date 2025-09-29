package org.functionalinterfaces;

import java.util.function.Function;

public class P2_FunctionDemo {

    public static void main(String[] args) {

        // get length of given string [Def lamba expression impl]
        Function<String, Integer> lenOpr = a -> a.length();

        /**
         * So above we have given impl to abstract method apply() of Function FI
         * Below we are executing them on multiple inputs
         */

        int leng = lenOpr.apply("Pikachu");
        int leng2= lenOpr.apply("Mandir");
        int leng3= lenOpr.apply(" Pikachu ");

        System.out.println("string length1 - " + leng); // string length1 - 7
        System.out.println("string leng2 - " + leng2);  // string leng2 - 6
        System.out.println("string leng3 - " + leng3); // string leng3 - 9

        System.out.println();

        //get double of given number [Def lamba expression impl]
        Function<Integer, Integer> doubleOpr = a -> a * 2;

        int doub1 = doubleOpr.apply(100);
        int doub2 = doubleOpr.apply(200);
        System.out.println(doub1 + " " + doub2); // 200 400

        System.out.println();

        // Req - check given emp is male or not
        // creating emp objects
        Employee emp1 = new Employee(1,"Atul",50000,'M');
        Employee emp2 = new Employee(2,"Deepa",90000,'F');

        // Def lambda expression for this req
        Function<Employee,Boolean> isMaleOpr = emp -> emp.getGender() == 'M';

        boolean isMEmp1 = isMaleOpr.apply(emp1);
        boolean isMEmp2 = isMaleOpr.apply(emp2);
        System.out.println("isMEmp1 : " + isMEmp1 + " , isMEmp2 : " + isMEmp2);
        // isMEmp1 : true , isMEmp2 : false




    }
}
