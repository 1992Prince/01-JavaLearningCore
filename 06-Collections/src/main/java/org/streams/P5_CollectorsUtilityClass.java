package org.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class P5_CollectorsUtilityClass {

    public static void main(String[] args) {

        List<Employee> employees = P2_StreamOperations.employeeList();

        // fetch Unique dept name
        Set<String> deptNames = employees.stream().map(emp -> emp.getDepartment()).collect(Collectors.toSet());
        // above is equivalent to below
        Set<String> deptNames2 = employees.stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println("Unique dept name : " + deptNames);
        System.out.println("Unique dept name : " + deptNames2);
        System.out.println();
        /**
         * output
         * Unique dept name : [Sales, Finance, HR, IT, Marketing]
         * Unique dept name : [Sales, Finance, HR, IT, Marketing]
         */

        // collect emp ids and their salary in hashmap, key is id and value should be salary
        Map<Integer, Double> empMap = employees.stream().collect(Collectors.toMap(emp -> emp.getId(), emp -> emp.getSalary()));
        // using method references
        Map<Integer, Double> empMap2 = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getSalary));
        System.out.println(empMap);
        System.out.println(empMap2);
        System.out.println();

        /**
         * Output
         * {19=90000.0, 101=65000.0, 103=45000.0, 999=43000.0, 136=55000.0, 105=72000.0, 106=50000.0, 10=48000.0, 189=70000.0, 109=78000.0}
         * {19=90000.0, 101=65000.0, 103=45000.0, 999=43000.0, 136=55000.0, 105=72000.0, 106=50000.0, 10=48000.0, 189=70000.0, 109=78000.0}
         */

        // groupingBy
        // get avg salary of each dept [here we are doing grouping by dept and finding avg salary of each dept]
        Map<String, Double> avgSalaryDeptWise = employees.stream().collect(Collectors.groupingBy(
                emp -> emp.getDepartment(),
                Collectors.averagingDouble(emp -> emp.getSalary())
        ));
        // via method references
        Map<String, Double> avgSalaryDeptWise2 = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)
        ));
        System.out.println(avgSalaryDeptWise);
        System.out.println(avgSalaryDeptWise2);
        System.out.println();

        /**
         * Output:
         * {Sales=44000.0, Finance=74000.0, HR=51500.0, IT=75666.66666666667, Marketing=50000.0}
         * {Sales=44000.0, Finance=74000.0, HR=51500.0, IT=75666.66666666667, Marketing=50000.0}
         */

        // count()
        // get count of employees gender wise
        Map<String, Long> deptWiseCount = employees.stream().collect(Collectors.groupingBy(
                Employee::getGender,
                Collectors.counting()
        ));
        System.out.println(deptWiseCount); // {Male=5, Female=5}

        // similary we can get Sum of all salary dept wise of gender wise using groupBy






    }

}
