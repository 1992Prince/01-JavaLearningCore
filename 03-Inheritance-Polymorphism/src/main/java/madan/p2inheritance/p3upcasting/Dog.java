package madan.p2inheritance.p3upcasting;

public class Dog extends Animal {

    public void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}
