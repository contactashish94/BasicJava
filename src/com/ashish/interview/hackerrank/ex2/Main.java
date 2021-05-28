package com.ashish.interview.hackerrank.ex2;

public class Main {
    public static void main(String[] args) {
        char[] arr = {'e','a','b','e','c','d'};
        Main main  = new Main();
        main.sortArray(arr);
        for (char ch: arr) {
            System.out.println(ch);
        }

    }
    private void sortArray(char[] arr){
        char temp;
        for (int i = 0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}
