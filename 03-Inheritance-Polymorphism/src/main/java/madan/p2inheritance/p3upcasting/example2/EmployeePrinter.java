package madan.p2inheritance.p3upcasting.example2;

public class EmployeePrinter {

    public static void printEmployeeDetails(Employee emp) {
        // ✅ Can call only parent methods or overridden ones
        System.out.println(emp.getDetails());
    }
}
