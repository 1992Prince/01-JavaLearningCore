package org.functionalinterfaces;

import java.util.function.Predicate;

public class P3_PredicateDemo {

    public static void main(String[] args) {

        // Req - check given emp is male or not
        Predicate<Employee> isEmpMaleOpr = emp -> emp.getGender() == 'M';

        // creating emp objects
        Employee emp1 = new Employee(1,"Atul",50000,'M');
        Employee emp2 = new Employee(2,"Deepa",90000,'F');

        boolean isMEmp1 = isEmpMaleOpr.test(emp1);
        boolean isMEmp2 = isEmpMaleOpr.test(emp2);
        System.out.println("isMEmp1 : " + isMEmp1 + " , isMEmp2 : " + isMEmp2);
        // isMEmp1 : true , isMEmp2 : false

        System.out.println();

        // Req - given salary is greater than 50k or not
        Predicate<Employee> isSalaryGreater = emp -> emp.getSalary() > 50000;
        boolean isMEmp3 = isSalaryGreater.test(emp1);
        boolean isMEmp4 = isSalaryGreater.test(emp2);
        System.out.println("isMEmp3 : " + isMEmp3 + " , isMEmp4 : " + isMEmp4);
        // isMEmp3 : false , isMEmp4 : true

        System.out.println();

        // Req - check given no is even or not
        Predicate<Integer> isEven = ele -> ele % 2 == 0;
        System.out.println(isEven.test(10) + " " + isEven.test(13)); // true false
    }
}
