package com.ashish.practiceinterview.palindrom;

public class StringPalindrome {
    public static void main(String[] args) {
        String str = "AAAA";
        String reverse="";
        for(int i = str.length()-1;i>=0;i--){
            reverse = reverse+str.charAt(i);
        }
        System.out.println("Reversed Character is :" + reverse);
        System.out.println(reverse.equals(str));
    }
}
