package com.ashish.interview.interviewkit.persistent;

import java.util.ArrayList;

public class ListMultiplication {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>(3);
        for(int i = 0 ; i < 3 ; i++){
            lists.add(new ArrayList<>());
        }
        lists.get(0).add(1);
        lists.get(0).add(2);
        lists.get(0).add(3);

        lists.get(1).add(1);
        lists.get(1).add(2);
        lists.get(1).add(3);

        lists.get(2).add(1);
        lists.get(2).add(2);
        lists.get(2).add(3);

        ArrayList<ArrayList<Integer>> lists2 = new ArrayList<>(3);
        for(int i = 0 ; i < 3 ; i++){
            lists2.add(new ArrayList<>());
        }

        lists2.get(0).add(1);
        lists2.get(0).add(2);
        lists2.get(0).add(3);

        lists2.get(1).add(1);
        lists2.get(1).add(2);
        lists2.get(1).add(3);

        lists2.get(2).add(1);
        lists2.get(2).add(2);
        lists2.get(2).add(3);

        System.out.println(lists);
        System.out.println(lists2);

        int sum = 0;
        for(int i = 0 ; i < 3; i ++){
            for(int j = 0 ; j < 3;j++){
                for(int k = 0 ; k < 3;k++){
                    sum=sum+lists.get(i).get(k)+lists.get(k).get(i);
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
