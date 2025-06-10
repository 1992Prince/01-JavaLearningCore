package madan.p2inheritance.p3upcasting.example2;

// 🔹 Parent class
public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getDetails() {
        return "Employee: " + name;
    }
}
