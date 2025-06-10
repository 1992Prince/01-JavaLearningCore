package madan.p2inheritance.p4downcasting;

public class AnimalUtility {

    public static void performAction(Animal animal){

        animal.eat();// call parent class generic method
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bark(); // check if animal is dog then call Dog class specific method
        }else if(animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.meow(); // check if animal is cat then call Cat class specific method
        }
    }
}
