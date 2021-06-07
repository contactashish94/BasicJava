package com.ashish.interview.hackerrank.ex3;

import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.replaceAll("\\s{2,}", " ").trim();
        String[] arr = s.split(" ");
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].contains("'")) {
                if (arr[i].contains(",")) {
                    arr[i] = arr[i].replaceAll(",", "");
                } else if (arr[i].contains("?")) {
                    arr[i] = arr[i].replace("?", "");
                } else if (arr[i].contains("!")) {
                    arr[i] = arr[i].replaceAll("!", "");
                } else if (arr[i].contains("_")) {
                    arr[i] = arr[i].replaceAll("_", "");
                } else if (arr[i].contains(".")) {
                    arr[i] = arr[i].replaceAll(".", "");
                } else if (arr[i].contains("@")) {
                    arr[i] = arr[i].replaceAll("@", "");
                }
                addToList(list, arr[i]);

            } else if (arr[i].contains("'")) {
                String[] newarr = arr[i].split("'");
                for (String st : newarr) {
                    addToList(list, st);
                }
            }

        }
        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }
        scan.close();
    }

    static void addToList(ArrayList list, String listObject) {
        if (!listObject.isEmpty()) {
            list.add(listObject);
        }
    }
}
