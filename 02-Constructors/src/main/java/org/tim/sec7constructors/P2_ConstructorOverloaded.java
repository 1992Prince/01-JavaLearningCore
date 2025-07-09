package org.tim.sec7constructors;

public class P2_ConstructorOverloaded {

    P2_ConstructorOverloaded() {
        System.out.println("Default constructor");
    }

    P2_ConstructorOverloaded(String model) {
        System.out.println("Car model: " + model);
    }

    P2_ConstructorOverloaded(String model, int year) {
        System.out.println("Car model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        P2_ConstructorOverloaded c1 = new P2_ConstructorOverloaded();   // Default constructor
        P2_ConstructorOverloaded c2 = new P2_ConstructorOverloaded("Swift"); // Car model: Swift
        P2_ConstructorOverloaded c3 = new P2_ConstructorOverloaded("BMW", 2022); // Car model: BMW, Year: 2022
    }
}
