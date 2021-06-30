package com.ashish.practiceinterview.palindrom;

public class IntPalindrome {
    public static void main(String[] args) {
        int num = 12345;
        int remainder;
        int reverse = 0;
        while (num > 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }
        System.out.println("Reversed Number is  : " + reverse);
    }
}
