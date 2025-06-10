package madan.p2inheritance.p3upcasting.example2;

public class Main {

    public static void main(String[] args) {
        Employee dev = new Developer("Ravi");
        Employee mgr = new Manager("Simran");

        // ✅ Upcasting happens automatically when passing to method
        EmployeePrinter.printEmployeeDetails(dev);
        EmployeePrinter.printEmployeeDetails(mgr);

        /**
         * Developer: Employee: Ravi
         * Manager: Employee: Simran
         */

        // dev.writeCode(); // ❌ Not accessible through Employee reference
        // mgr.conductMeeting(); // ❌ Same
    }
}
