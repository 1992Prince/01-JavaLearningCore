package org.streams;

import java.util.List;
import java.util.Optional;

public class P4_StreamOperations {

    public static void main(String[] args) {

        List<Employee> employees = P2_StreamOperations.employeeList();

        // sorted() - intermediate operation
        // Get emp ids in sorted order - first we need to get emp ids and then sort it
        List<Integer> sortedEmpIds = employees.stream()
                .map(emp -> emp.getId())
                .sorted()
                .toList();
        System.out.println("sortedEmpIds - " + sortedEmpIds);
        System.out.println();
        // sortedEmpIds - [10, 19, 101, 103, 105, 106, 109, 136, 189, 999]

        // sorted Comparator Arg behaviour
        // define sorting based on employees Id's and sort employee objects
        // above we have fetched emp ids and did sorting on that but now
        // I should not extract emp ids but by using emp ids I have to sort emp objects itself
        // here we will call sorted() method directly on streams of emp objects
        List<Employee> sortedEmp = employees.stream()
                .sorted((e1, e2) -> e1.getId() - e2.getId())
                .toList();
        System.out.println("sortedEmp - " + sortedEmp);
        System.out.println();
        // sortedEmp - [Employee{name='Hannah'}, Employee{name='George'}, Employee{name='Alice'}, Employee{name='Charlie'}, Employee{name='Ethan'}, Employee{name='Fiona'}, Employee{name='Ian'}, Employee{name='Bob'}, Employee{name='Diana'}, Employee{name='Jane'}]

        // find min salary employee details
        Employee minSalaryEmp = employees.stream()
                .min((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .get();
        System.out.println("Min Salary Emp is - " + minSalaryEmp);
        System.out.println();
        // Min Salary Emp is - Employee{name='Jane'}

        // find max salary employee details
        Employee maxSalaryEmp = employees.stream()
                .max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()))
                .get();
        System.out.println("Max Salary Emp is - " + maxSalaryEmp); // Max Salary Emp is - Employee{name='George'}
        System.out.println();

        // avg()
        // find avg salary of emps
        // so here firstly we need to extract emp salary using map and this time we will use mapToDouble
        // mapToDouble will only deal with double values and salary is our double type
        // mapToDouble functionality will be similar to map funtion
        // Salary is double value so we took mapToDouble
        // avg method u will not get in map but u will get in mapTpoDouble()
        double doubleAvgSalary = employees.stream().mapToDouble(emp -> emp.getSalary())
                .average().getAsDouble();
        System.out.println("Double Avg Salary is - " + doubleAvgSalary);
        // Double Avg Salary is - 61600.0

        System.out.println();

        /**
         * map returns Stream<> for other datatype and collections use this and
         * for primitive types use below
         *
         * mapToDouble return DoubleStream
         * mapToInt return IntStream
         * mapToLong returns LongStream
         */

        // find avg age of employees and age is in int value use we can use mapToInt instead of map
        double doubleAvgAge = employees.stream().mapToInt(emp -> emp.getAge())
                        .average().getAsDouble();
        System.out.println("Double Avg Emp age is - " + doubleAvgAge);
        System.out.println(); //Double Avg Emp age is - 28.9

        // peek()



    }

}
