package com.ashish.interview.hackerrank.ex2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function

        Pattern p = Pattern.compile("[^a-zA-Z0-9]");
        if (!Pattern.compile("[^a-zA-Z0-9]").matcher(a).find() && (a.length() >= 1 && b.length() <= 50)) {
            if(a.length()!=b.length()){
                return false;
            } else{
                char[] first = a.toLowerCase().toCharArray();
                char[] second = b.toLowerCase().toCharArray();
                Arrays.sort(first);
                Arrays.sort(second);
                if (Arrays.equals(first,second)) return true;
            }

            return true;
        } else return false;


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
