package com.ashish.interview.hackerrank.regexstudy.regex.ex2;

import java.util.*;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
class UsernameValidator{
    static String regularExpression="^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    //static String regularExpression="^[a-z]{7,29}$";
}