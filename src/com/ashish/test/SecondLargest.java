package com.ashish.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,3,2,8};
        int[] arr1 = {0,0,0,2,0,1,-2};
        System.out.println("SecondLargestNumber is : " + secondLargets(arr));
        System.out.println("SecondLargestNumber is : " + secondLargets(arr1));
    }

    private static int secondLargets(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        int[] ar = null;

        if(arr.length==0 ||arr.length==1){
            return -1;
        }
        if(arr.length>1){
            //arr = localSort(arr);
            for(int i = 0; i<arr.length;i++){
                map.put(arr[i],1);
            }
           ar = new int[map.size()];
           int k =0;
            if(!map.isEmpty()) {
                for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                    ar[k] = entry.getKey();
                    k++;
                }
                if(map.size()==0||map.size()==1){
                    return -1;
                } else {
                    localSort(ar);
                    return ar[ar.length - 2];
                }
            }
        }
        return -1;
    }

    static int[] localSort(int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}