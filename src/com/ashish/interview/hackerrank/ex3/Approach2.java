package com.ashish.interview.hackerrank.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Approach2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        String[] arr = s.split("[!,?.*_'@\\ ]+");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}