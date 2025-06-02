package com.easybytes.sec10inheritance.tim.p2_composition.p2compositonchallenge;

public class Main {

    /*
    Class diagram can be found at - D:\EasyBytesJavaNotes\sec10_inheritance\tim\p2_composition
     */
    public static void main(String[] args) {

        Refrigerator iceBox = new Refrigerator();
        DishWasher dishWasher = new DishWasher();
        CoffeeMaker brewMaster = new CoffeeMaker();

        SmartKitchen smartKitchen = new SmartKitchen(brewMaster, dishWasher, iceBox);
        smartKitchen.setKitchenState(true, true, true);
        smartKitchen.doKitchenWork();

        System.out.println();

        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();
    }
}
