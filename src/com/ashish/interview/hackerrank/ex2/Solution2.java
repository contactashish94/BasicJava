package com.ashish.interview.hackerrank.ex2;

import java.util.Scanner;

public class Solution2 {
    static int charNo = 256;

    public static boolean isAnagram(String a, String b) {
        char[] achar = a.toLowerCase().toCharArray();
        char[] bchar = b.toLowerCase().toCharArray();
        if (achar.length != bchar.length) {
            return false;
        }
        sortArray(achar);
        sortArray(bchar);
        for (int i = 0 ; i < achar.length-1; i++){
            System.out.println("Print --> " + i);
            System.out.println(achar[i]);
        }

        String flag="";
        for (int i = 0; i < a.length()-1; i++) {
            if (achar[i] != bchar[i]) {
                flag="false";
                break;
            }
        }
        return flag=="";
    }
    private static void sortArray(char[] arr){
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


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
