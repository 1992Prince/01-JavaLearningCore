package org.streams;

import java.util.ArrayList;
import java.util.List;

public class P2_StreamOperations {

    public static void main(String[] args) {

        List<Employee> employees = employeeList();

        //Req - Get all employees names as List

        // before jdk8 - we will use for Each loop
        List<String> empNamesList = new ArrayList<>();
        for(Employee emp:employees){
            empNamesList.add(emp.getName());
        }
        System.out.println("Before JDK 8 - " + empNamesList);
        // Before JDK 8 - [Alice, Bob, Charlie, Diana, Ethan, Fiona, George, Hannah, Ian, Jane]
        System.out.println();

        // Using jdk8 streams features [below is complete stream pipeline => Source + Intermediate operation + terminal operation]
        // map accepts Function Funcational interface
        List<String> empNamesList2 = employees.stream().map(emp -> emp.getName()).toList();
        System.out.println("Using jdk8 streams - " + empNamesList2);
        // Using jdk8 streams - [Alice, Bob, Charlie, Diana, Ethan, Fiona, George, Hannah, Ian, Jane]
        System.out.println();

        //Req - filter employees with age greater than 25 and get their names
        // here we need to create new stream object and can't reuse any above stream object
        // bcoz once stream is consumed we can't reuse it
        // filter accepts Predicate Functional interface
        List<String> empAgeList = employees.stream()    // Stream object
                .filter(emp -> emp.getAge() > 25)       // Intermediate Operation
                .map(emp -> emp.getName())              // Intermediate Operation
                .toList();                              // terminal operation
        System.out.println("Emp with age > 25 : " + empAgeList);
        // Emp with age > 25 : [Alice, Bob, Diana, Ethan, Fiona, George, Hannah, Ian]
        System.out.println();

        // Req - print all distint city names of employees
        // forEach accepts Consumer Functional interface
        employees.stream()            // Stream obj
                .map(emp -> emp.getCity())  // Intermediate operation
                .distinct()                 // Intermediate operation
                .forEach(System.out::println); // Terminal operation

        System.out.println();

        /**
         * Output
         * Mumbai
         * Delhi
         * Bangalore
         * Hyderabad
         * Pune
         * Chennai
         * Kolkata
         */




    }

    public static List<Employee> employeeList(){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Alice", "Mumbai", 28, "Female", "IT", 2018, 65000.0));
        employees.add(new Employee(136, "Bob", "Delhi", 32, "Male", "HR", 2015, 55000.0));
        employees.add(new Employee(103, "Charlie", "Bangalore", 25, "Male", "Sales", 2020, 45000.0));
        employees.add(new Employee(189, "Diana", "Hyderabad", 29, "Female", "Finance", 2017, 70000.0));
        employees.add(new Employee(105, "Ethan", "Pune", 30, "Male", "IT", 2016, 72000.0));
        employees.add(new Employee(106, "Fiona", "Mumbai", 27, "Female", "Marketing", 2019, 50000.0));
        employees.add(new Employee(19, "George", "Delhi", 35, "Male", "IT", 2012, 90000.0));
        employees.add(new Employee(10, "Hannah", "Bangalore", 26, "Female", "HR", 2021, 48000.0));
        employees.add(new Employee(109, "Ian", "Chennai", 33, "Male", "Finance", 2014, 78000.0));
        employees.add(new Employee(999, "Jane", "Kolkata", 24, "Female", "Sales", 2022, 43000.0));

        return employees;
    }
}
