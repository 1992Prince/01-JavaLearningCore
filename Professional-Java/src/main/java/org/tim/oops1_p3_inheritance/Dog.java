package org.tim.oops1_p3_inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                '}' + super.toString();
    }

    @Override
    public void makeNoise(){
        if(type == "Wolf"){
            System.out.println("WOOF WOOF!");
            return;
        }
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        //System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark() {
        System.out.println("WOOF WOOF!");
    }

    private void run() {
        System.out.println("Dog Running!");
    }

    private void walk() {
        System.out.println("Dog walking!");
    }

    private void wagTail() {
        System.out.println("Tail Wagging!");
    }
}
