package com.ashish.interview.hackerrank.MyRegex;

import java.util.*;


class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}

class MyRegex {
    String num = "(\\d{1,2}||(0|1)\\d{2}||2[0-4]\\d||25[0-5])";
    String pattern = num + "." + num + "." + num + "." + num;
}