package com.ashish.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.health = 20;

        player.damage(10);

        player.healthRemain();


        int damage = 11;

        player.health = 200;

        player.damage(damage);

        player.healthRemain();


        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Ashu", 200, "Sword");

        System.out.println("Enhanced Player's helath remaing : " + enhancedPlayer.getHealth());

        enhancedPlayer.loseHealth(10);

        System.out.println("Enhanced Player's helath remaing : " + enhancedPlayer.getHealth());
    }
}
