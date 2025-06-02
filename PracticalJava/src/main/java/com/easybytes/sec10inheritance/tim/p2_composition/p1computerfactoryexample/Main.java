package com.easybytes.sec10inheritance.tim.p2_composition.p1computerfactoryexample;

public class Main {

    /*
    Below program shows inheritance with composition concept
     */

    public static void main(String[] args) {

        // creating instances of ComputerCase, Monitor and Motherboard classes
        ComputerCase theCase = new ComputerCase("2208", "Dell", "240");
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // now going to create an instance of PersonalComputer class [assembling our personal computer using composition]
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMonitor, theMotherboard);

        /*
        // lets draw something on computer monitor, below fetching instance of monitor using getter method from thePC instance
        thePC.getMonitor().drawPixelAt(10, 10, "red");

        // lets load motherboard program
        thePC.getMotherboard().loadProgram("Windows 10 OS");

        // lets press power button
        thePC.getComputerCase().pressPowerButton(); */

        /*
        See above with help of thePC we are able to access the methods of ComputerCase/Monitor/Motherboard
        We want to restrict it and don't want others to access these classes directly
        To restict it we need to comment getter methods in PersonalComputer class
         */

        thePC.powerUp();
    }
}
