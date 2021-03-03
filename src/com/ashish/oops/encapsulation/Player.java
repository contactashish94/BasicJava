package com.ashish.oops.encapsulation;

public class Player {
    public int health;

    public void damage(int damage){
        this.health = this.health-damage;
        if(this.health <= 0){
            System.out.println("Player knocked out");
        }
    }
    public void healthRemain(){
        System.out.println("remaining health : " + this.health);
    }
}
