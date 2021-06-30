package com.ashish.practiceinterview.vowelscount;

import java.util.ArrayList;

public class VowelConsCounter {
    public static void main(String[] args) {
        String str = "azVowelConsCounter";
        //ArrayList<Character> vowelCounter = new ArrayList<>();
        //ArrayList<Character> consCounter = new ArrayList<>();
        int vowelCounter = 0;
        int consCounter = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowelCounter++;
                } else {
                    consCounter++;
                }
            }
        }
    }
}
