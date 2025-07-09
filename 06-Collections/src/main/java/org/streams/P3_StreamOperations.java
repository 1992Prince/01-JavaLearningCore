package org.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class P3_StreamOperations {

    public static void main(String[] args) {

        List<Employee> employees = P2_StreamOperations.employeeList();

        // Req - Get count of employees whose salary is > 20k

        long count = employees.stream()  // stream object
                .filter(emp -> emp.getSalary() > 20000) // intermediate operation
                .count(); // terminal operation

        System.out.println("Count is : " + count); // Count is : 10
        System.out.println();

        // Req : Get first three employees object as a list
        List<Employee> empListByName = employees.stream() // stream object
                .limit(3) // intermediate operation
                .toList(); // terminal operation
        System.out.println(empListByName);
        System.out.println();

        // [Employee{name='Alice'}, Employee{name='Bob'}, Employee{name='Charlie'}]

        // Req - skip first 3 employees and I want to collect others employees data
        empListByName = employees.stream() // stream object
                .skip(3) // intermediate operation
                .toList();// terminal operation
        System.out.println(empListByName);
        System.out.println();
        // [Employee{name='Diana'}, Employee{name='Ethan'}, Employee{name='Fiona'}, Employee{name='George'}, Employee{name='Hannah'}, Employee{name='Ian'}, Employee{name='Jane'}]

        // anyMatch method - terminal operation
        // anyMatch accepts Predicate Functional interface
        // verify any emp is below 18 years of age and return true or false
        boolean bool = employees.stream() // stream object
                .anyMatch(emp -> emp.getAge() < 18);
        System.out.println("Boolean - " + bool); // Boolean - false
        System.out.println();

        // allMatch - terminal operation
        // allMatch accepts Predicate
        // check every emp joined after 2010 or not [here if all have joined after 2010 then return true
        // and if anyone have not joined then return false]
        boolean joinedAfter2010Bool = employees.stream() // stream object
                .allMatch(emp -> emp.getYearOfJoining() > 2010);
        System.out.println("joinedAfter2010Bool - " + joinedAfter2010Bool); // joinedAfter2010Bool - true
        System.out.println();

        // noneMatch - terminal operation - completely opposite to allMatch
        // accepts Predicate
        // check every employee salary under < 10000
        // if no emp matching then it will return true
        // if anyone emp salary matches then it will return false

        boolean bool2 = employees.stream() // stream object
                .allMatch(emp -> emp.getSalary() < 10000);
        System.out.println("bool2 - " + bool2); // bool2 - false
        System.out.println();

        // findAny() - terminal operation
        // when stream are having one or more values and I want to get one value from all stream values from stream
        Optional<Employee> optinalObj = employees.stream()
                .findAny(); // terminal operation and returns Optional<Employee>
        Employee emp = optinalObj.get();
        System.out.println("findAny Emp - " + emp); // Emp - Employee{name='Alice'}
        System.out.println();

        // findFirst() - - terminal operation
        // findAny() can pickup any value from stream values but findFirst() will always return first value from stream values
        // always return first element of stream
        Employee firstEmp = employees.stream().findFirst().get();
        System.out.println("findFirst FirstEmp : " + firstEmp); // findFirst FirstEmp : Employee{name='Alice'}
        System.out.println();

        // Req - filter with IT dept and find any emp first and then find always first one
        Employee findAnyEmp = employees.stream().filter(ele -> ele.getDepartment().equals("HR")).findAny().get();
        Employee findFirstEmp = employees.stream().filter(ele -> ele.getDepartment().equals("HR")).findFirst().get();
        System.out.println(findAnyEmp + " " + findFirstEmp); // Employee{name='Bob'} Employee{name='Bob'}
        System.out.println();




    }

}
