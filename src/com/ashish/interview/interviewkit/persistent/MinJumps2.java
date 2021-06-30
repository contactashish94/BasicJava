package com.ashish.interview.interviewkit.persistent;

public class MinJumps2 {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr = {1, 3, 6, 3, 2, 3, 6, 8, 9};
        System.out.println(countJump(arr));
    }

    private static int countJump(int[] arr) {
        int i = 0, n = arr.length, step = 0, end = 0, maxend = 0, maxindex = 0;
        while (end < n - 1) {
            step++;
            for (i = maxindex; i <= end; i++) {
                if ((i + arr[i]) > maxend) {
                    maxend = (i + arr[i]);
                    maxindex = i;
                }
                if (maxend >= n - 1) return step;
            }
            end = maxend;
        }
        return n == 1 ? 0 : -1;
    }
}