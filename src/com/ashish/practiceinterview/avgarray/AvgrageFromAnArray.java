package com.ashish.practiceinterview.avgarray;

public class AvgrageFromAnArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        float avg = 0f;
        int total = 0;
        for(int i = 0 ; i < a.length;i++){
            total= total + a[i];
        }
        avg = total/a.length;
        System.out.println(avg);
    }
}
