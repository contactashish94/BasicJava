package com.ashish.method.overloading;

public class Main {
    public static void main(String[] args) {
        int x = calculateScore(50, "ABCD");
        System.out.println("First Player" + x);

        int y = calculateScore("XYZ", 21);

        System.out.println("second player" + y);
    }

    private static int calculateScore(int score, String playerName){
        System.out.println("Player" + playerName + "Scored" + score + "Points");
        return score*1000;
    }

    private static int calculateScore(String playerName,int score){
        System.out.println(score + "was" + "Scored by" + playerName);
        return score*5000;

    }
}
