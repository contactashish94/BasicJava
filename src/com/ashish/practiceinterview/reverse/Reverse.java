package com.ashish.practiceinterview.reverse;

public class Reverse {
    public static void main(String[] args) {
        String str = new String("abcd");
        Reverse.revreseReccursively(str);


    }
    private static String revreseReccursively(String input){
        if(input.length()<2){
            return input;
        }
        return revreseReccursively(input.substring(1))+input.charAt(0);
    }
}
