package com.ashish.interview.interviewkit.persistent;

import java.util.*;
import java.io.*;

class MinJumps {
    // Returns minimum number of
    // jumps to reach arr[h] from arr[l]

    public static int jump(int[] nums) {
        int i = 0, n = nums.length, step = 0, end = 0, maxend = 0,maxIndex=0;
        while (end < n - 1) {
            //System.out.println("Loop call");
            step++;
            for (i = maxIndex; i <= end; i++) {
                //System.out.println("for loop call");
                if ((i + nums[i]) > maxend) {
                    maxend = i + nums[i];
                    maxIndex = i;
                }
                if (maxend >= n - 1) return step;
            }
            end = maxend;
        }
        return n == 1 ? 0 : -1;
    }

    public static int jump2(int[] nums) {
        int i = 0, n = nums.length, step = 0, end = 0, maxend = 0;
        while (end < n - 1) {
            step++;
            for (; i <= end; i++) {
                maxend = Math.max(maxend, i + nums[i]);
                if (maxend >= n - 1) return step;
            }
            if (end == maxend) break;
            end = maxend;
        }
        return n == 1 ? 0 : -1;
    }

    // Driver code
    public static void main(String args[]) {
        //int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9};
        //int arr[] = {2, 3, 1, 1, 4};
        int arr[] = {2,3,1,1,2,4,2,0,1,1};
        int n = arr.length;
        System.out.println(System.currentTimeMillis());
        System.out.println("Minimum number of jumps to reach end is JUMP1 " + jump(arr));
        //System.out.println("Minimum number of jumps to reach end is JUMP2 " + jump2(arr));
        System.out.println(System.currentTimeMillis());
    }
}
