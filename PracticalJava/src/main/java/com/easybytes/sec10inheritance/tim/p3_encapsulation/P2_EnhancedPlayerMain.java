package com.easybytes.sec10inheritance.tim.p3_encapsulation;

public class P2_EnhancedPlayerMain {

    public static void main(String[] args) {

        /*
        In P2_EnhancedPlayer, we have encapsulated the fields and methods
        With help of encapsulation u can keep your fields private and provide getter and setter methods
        with setter methods u can add validation logic to restrict the values of fields like in validation u can check
        if person setting values is authorised or not etc.

        So with help of Encapsulation we can keep our fields private and provide getter and setter methods to access.
        Add additional checks or validation at setter methods or at constructor level to restrict the values of fields.
        This will keep our data safe

         */

        P2_EnhancedPlayer player = new P2_EnhancedPlayer("Tim");
        System.out.println("Initial health is " + player.healthRemaining()); // Initial health is 100

        /*
        Below we will not be able to set value 200 due to additional check in setter method or at constructor level
         */
        P2_EnhancedPlayer tim = new P2_EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + tim.healthRemaining()); // Initial health is 100




    }
}
