package com.easybytes.sec10inheritance.tim.p3_encapsulation;

public class P2_EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public P2_EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }

    public P2_EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health <= 0){ // putting checks
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        this.weapon = weapon;
    }

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
