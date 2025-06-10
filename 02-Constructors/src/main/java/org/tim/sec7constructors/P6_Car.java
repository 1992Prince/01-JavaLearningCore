package org.tim.sec7constructors2;

//✅ Constructor Injection Example
// Constructor Injection = Providing dependencies via constructor (no hardcoding, more flexibility, easy to test/mock).
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}
public class P6_Car {

    Engine engine;

    // Constructor Injection
    P6_Car(Engine engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving...");
    }

    public static void main(String[] args) {
        Engine e = new Engine();
        P6_Car c = new P6_Car(e); // Injecting dependency
        c.drive();

        /**
         * Engine started
         * Car is driving...
         */
    }
}
