package com.ashish.interview.hackerrank.ex2;

import java.util.ArrayList;

public class ListSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(60);
        list.add(20);
        list.add(50);
        list.add(55);
        list.add(40);
        list.add(10);
        list.add(70);
        System.out.println("Old list --> "+list);
        int temp = 0;
        int size = list.size();
        for(int i = 0; i < size-1;i++){
            for(int j = i+1 ; j <size-1;j++){
                if(list.get(i)>list.get(j)){
                    temp = list.get(j);
                    list.set(j,list.get(i));
                    list.set(i,temp);
                }
            }
        }
        System.out.println("New list"+list);
    }
}
