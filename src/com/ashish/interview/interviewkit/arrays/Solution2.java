package com.ashish.interview.interviewkit.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        List<List<Integer>> arr = new ArrayList<>();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }
        int maxValue = Integer.MIN_VALUE;
        /*for (List<Integer> ab : arr) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    int sum = ab.get(i)+ab.get(i+1)+ab.get(i+2)
                            +ab.get(i+1)+
                            ab.get(i+2)+ab.get(j+1)+ab.get(i+2);
                    if(sum>maxValue){
                        maxValue=sum;
                    }
                }

            }
        }*/
        int[][] newarr = new int[6][6];
        /*for (List<Integer> ab : arr) {
            for(int i = 0 ; i < 6 ; i ++){
                for(int j = 0 ; j < 6 ; j ++){
                    newarr[i][j]=ab.get(i);
                }
            }
        }*/
        for (List<Integer> ab : arr) {
            newarr = ab.toArray(newarr);
            for(int i = 0 ; i < 6 ; i++){
                for(int j = 0 ; j < 6 ; j++){
                    System.out.print(newarr[i][j]+" ");
                }
                System.out.println("");
            }
        }
    }
}