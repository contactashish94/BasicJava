package com.ashish.practiceinterview.anagram;

import java.util.Collections;

public class AnagramFinder {
    public static boolean isAnagram(String inputString1, String inputString2) {

        char[] aChar = inputString1.toLowerCase().toCharArray();
        char[] bChar = inputString2.toLowerCase().toCharArray();
        if(aChar.length!=bChar.length){
            return false;
        }
        sortArray(aChar);
        sortArray(bChar);

        String flag = "";
        for (int i = 0; i < aChar.length - 1; i++) {
            if (aChar[i] != bChar[i]) {
                flag = "false";
            }
        }
        return flag == "";
    }

    private static void sortArray(char[] strchars) {
        //char[] strchars = inputString.toLowerCase().toCharArray();
        char temp;
        for (int i = 0; i < strchars.length - 1; i++) {
            for (int j = i + 1; j < strchars.length; j++) {
                if (strchars[i] > strchars[j]) {
                    temp = strchars[j];
                    strchars[j] = strchars[i];
                    strchars[i] = temp;
                }
            }
        }
    }
}
