package com.ashish.array;

public class SortAscending {
    public static void main(String[] args) {

        //int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = {9,45,67,1,2,3,4,5,68};
        int temp = 0;


//Way-1
        for (int i = 0; i <arr.length; i++) {
            for(int j = i+1; j <arr.length ; j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

//Way-2
       /* boolean flag = true;
        while(flag){
            flag = false;
            for(int i = 0 ; i <arr.length-1;i++){
                if(arr[i] < arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = true;
                }
            }
        }*/


        for(int i = 0 ; i < arr.length ; i++ ){
            System.out.println("Arrays : " + arr[i]);
        }

    }
}