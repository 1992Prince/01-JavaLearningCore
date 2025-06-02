package com.easybytes.sec10inheritance.tim.p3_encapsulation;

public class P1_PlayerMain {

    public static void main(String[] args) {

        /*
        Below u can see we are able to access the public variables of the class and class is not following encapsulation principles

        Since we can access the variables directly, anyone can change the values of the variables which is not good.
        In Banks if anyone hacked it and reached to main class then if all accounts are public then anyone can see the balance
        and change it like deducting amount etc. This is drawback and data is not secured if we are not follogin encapsulation principles.

        So we need to make the variables private and provide getter and setter methods to access them

        Another drawback
        Suppose u changed variable name to fullName in P1_Player.java. Now we need to change it in Main class also bcoz
        we are accessing it directly. This is not good approach.
        In small application it can work but in large application it can create issues.
        So we need to use encapsulation principles.
         */
        P1_Player player = new P1_Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());

        player.health = 200; // directly setting values without any check
    }
}
