package org.utilitypckg.collectionsclss;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P7_EmployeeSortByName {

    /*
    NOTE:

    Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name));
    and
    Collections.sort(employees, Comparator.comparing(e -> e.name));

     both sort the list of employees by their name in ascending (A → Z) order.
     */

    public static void main(String[] args) {

        //REQ1 -  Sort by Name Alphabetically (String Comparison)

        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 75000),
                new Employee("Bob", 60000)
        );



        //Collections.sort(employees, (e1, e2) -> e1.name.compareTo(e2.name)); // [both are equal]
        Collections.sort(employees, Comparator.comparing(e -> e.name));
        System.out.println(employees);

        /**
         * [Employee{name='Alice', salary=75000},
         * Employee{name='Bob', salary=60000},
         * Employee{name='John', salary=50000}]
         */







        System.out.println();





        //REQ2 - Sort by Name Alphabetically (String Comparison) in descending order
        List<Employee> employees2 = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 75000),
                new Employee("Bob", 60000)
        );

        Collections.sort(employees2, (e1, e2) -> e2.name.compareTo(e1.name));

        System.out.println(employees2);

        /**
         * [Employee{name='John', salary=50000},
         * Employee{name='Bob', salary=60000},
         * Employee{name='Alice', salary=75000}]
         */

    }
}
