package madan.p2inheritance.p3upcasting.example2;

// 🔹 Subclass 1
public class Developer extends Employee {

    public Developer(String name) {
        super(name);
    }

    @Override
    public String getDetails() {
        return "Developer: " + super.getDetails();
    }

    public void writeCode() {
        System.out.println("Writing code...");
    }
}
