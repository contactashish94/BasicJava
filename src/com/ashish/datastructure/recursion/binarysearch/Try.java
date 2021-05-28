package com.ashish.datastructure.recursion.binarysearch;

public class Try {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int value = 80;
        int midindex;
        int startIndex = 0;
        int lastIndex = arr.length-1;
        midindex = (startIndex+lastIndex)/2;
        while (startIndex<=lastIndex){
            if(arr[midindex]==value){
                System.out.println(midindex);
                break;
            } else if(arr[midindex]<value){
                startIndex=midindex+1;
            } else {
                lastIndex = midindex-1;
            }
            midindex = (startIndex+lastIndex)/2;
        }
    }
}
