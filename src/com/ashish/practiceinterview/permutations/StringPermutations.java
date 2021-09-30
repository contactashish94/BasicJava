package com.ashish.practiceinterview.permutations;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "abcd";
        printPermute(str, "");
    }

    private static void printPermute(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String restStr = str.substring(0, i) + str.substring(i + 1);
            printPermute(restStr, ans + ch);
        }
    }
}
