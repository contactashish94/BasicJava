package com.ashish.practiceinterview.anagram;

import com.ashish.interview.hackerrank.ex2.Solution2;

import java.util.Scanner;

public class AnagramMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();
        System.out.println(AnagramFinder.isAnagram(input1,input2));
        //System.out.println(Solution2.isAnagram(input1,input2));
    }
}
