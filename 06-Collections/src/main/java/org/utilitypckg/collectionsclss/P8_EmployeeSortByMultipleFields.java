package org.utilitypckg.collectionsclss;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P8_EmployeeSortByMultipleFields {

    public static void main(String[] args) {

        //REQ1 -  Sort by Salary in descending order and if salary is same the sort by name

        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Maria", 60000)
        );



        Collections.sort(employees, (e1, e2) -> {
            if (e1.salary != e2.salary) {
                return e2.salary - e1.salary; // Descending salary
            } else {
                return e1.name.compareTo(e2.name); // Then by name
            }
        });
        System.out.println(employees);

        /**
         * [Employee{name='Bob', salary=60000},
         * Employee{name='Maria', salary=60000},
         * Employee{name='Alice', salary=50000},
         * Employee{name='John', salary=50000}]
         */

        
    }
}
