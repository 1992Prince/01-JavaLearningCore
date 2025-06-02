package com.easybytes.sec10inheritance.tim.p3_encapsulation;

public class P1_Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <=0){
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining(){
        return this.health;
    }

    public void restoreHealth(int extraHealth){
        this.health = this.health + extraHealth;
        if(this.health > 100){
            System.out.println("Player restored to 100%");
            this.health = 100;
        }
    }

}
