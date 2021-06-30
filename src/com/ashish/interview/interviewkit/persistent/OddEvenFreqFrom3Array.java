package com.ashish.interview.interviewkit.persistent;

import java.util.Scanner;

public class OddEvenFreqFrom3Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {sc.nextInt(), sc.nextInt(), sc.nextInt()},
                {sc.nextInt(), sc.nextInt(), sc.nextInt()},
                {sc.nextInt(), sc.nextInt(), sc.nextInt()}
        };

        int m = 3;
        int n = 3;
        int even = 0;
        int odd = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Total Odd: = " + odd + "& Total Even : = " + even);
    }
}