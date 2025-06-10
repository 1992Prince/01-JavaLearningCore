package madan.p2inheritance.p3upcasting.example2;

public class Manager extends Employee{

    public Manager(String name) {
        super(name);
    }

    @Override
    public String getDetails() {
        return "Manager: " + super.getDetails();
    }

    public void conductMeeting() {
        System.out.println("Conducting meeting...");
    }
}
