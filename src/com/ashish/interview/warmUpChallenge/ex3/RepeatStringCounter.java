package com.ashish.interview.warmUpChallenge.ex3;

import java.util.Collections;
import java.util.Scanner;

public class RepeatStringCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //long length = Integer.parseInt(sc.nextLine());
        long n = sc.nextLong();
        //int n = length;
        String str = null;
        if (n > 0) {
            str = sc.next();
        }
        if (str != null) {
            System.out.println(Result.repeatedString(str, n));
        }
    }
}

class Result {

    public static long repeatedString(String format, long n) {
        long quotient = 0, remainder = 0;
        quotient = n / format.length();
        remainder = n % format.length();
        long partialLength = (remainder == 0) ? 0 : remainder;
        long resultCount = quotient * Result.getACount(format.toLowerCase(), format.length()) + Result.getACount(format.toLowerCase(), partialLength);
        return resultCount;
    }

    private static int getACount(String format, long strLength) {
        int aCount = 0;
        for (int i = 0; i < strLength; i++) {
            if (format.charAt(i) == 'a') {
                aCount++;
            }
        }
        return aCount;
    }
}