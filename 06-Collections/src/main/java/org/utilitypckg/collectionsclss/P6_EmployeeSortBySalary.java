package org.utilitypckg.collectionsclss;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P6_EmployeeSortBySalary {

    /**
     * NOTE - Collections.sort(employees, (e1, e2) -> e1.salary - e2.salary);
     * and
     * Collections.sort(employees, Comparator.comparingInt(e -> e.salary));
     *
     * they both sort employees by salary in ascending order
     */

    public static void main(String[] args) {

        //REQ1 -  Sort Custom Class (e.g., Employee) by Salary in ascending order

        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 75000),
                new Employee("Bob", 60000)
        );

        System.out.println(employees);
        /**
         * [Employee{name='John', salary=50000},
         * Employee{name='Alice', salary=75000},
         * Employee{name='Bob', salary=60000}]
         */

        System.out.println();


        // Collections.sort(employees, (e1, e2) -> e1.salary - e2.salary); // [both are equal]
        Collections.sort(employees, Comparator.comparingInt(e -> e.salary));
        System.out.println(employees);

        /**
         * [Employee{name='John', salary=50000},
         * Employee{name='Bob', salary=60000},
         * Employee{name='Alice', salary=75000}]
         */







        System.out.println();





        //REQ2 -  sort employees names by salary in descending order

        List<Employee> employees2 = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 75000),
                new Employee("Bob", 60000)
        );

        Collections.sort(employees2, (e1, e2) -> e2.salary - e1.salary);
        System.out.println(employees2);

        /**
         * [Employee{name='Alice', salary=75000},
         * Employee{name='Bob', salary=60000},
         * Employee{name='John', salary=50000}]
         */
    }
}
