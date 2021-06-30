package com.ashish.practiceinterview.permutations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Check.permute(str);
    }

    public static void permute(String str) {
        permute(str, "");
    }

    private static void permute(String str, String ref) {
        //ArrayList<String> list = new ArrayList<>();
        if (str.length() == 0) {
            System.out.print(ref + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remains = str.substring(0, i) + str.substring(i + 1);
            permute(remains, ref + ch);
        }

    }
}
