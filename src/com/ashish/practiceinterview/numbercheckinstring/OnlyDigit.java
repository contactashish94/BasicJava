package com.ashish.practiceinterview.numbercheckinstring;

public class OnlyDigit {
    public static void main(String[] args) {
        String str = "-1234";
        System.out.println(checkIfDigit(str));
    }

    private static boolean checkIfDigit(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }
        }
        return count == str.length();
    }
}
