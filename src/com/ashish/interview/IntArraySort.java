package com.ashish.interview;

import java.util.Collections;
import java.util.LinkedList;

public class IntArraySort {
    public static void main(String[] args) {
        int[] arr= {1,4,8,3,78,23,90,12,24,56};
        int temp;
        for (int i = 0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(45);
        list.add(78);
        list.add(90);
        list.add(24);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
