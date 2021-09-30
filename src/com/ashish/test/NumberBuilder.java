package com.ashish.test;

import java.util.Arrays;
import java.util.Collections;

public class NumberBuilder {
    public static void main(String[] args) {
        String number="817";
        System.out.println(buildHigherNumber(number));
    }
    static String buildHigherNumber(String num){
        int[] count=new int[num.length()];
        int result=num.charAt(0)-'0';
        for(int i = 0 ; i < num.length();i++){
            count[i]=num.charAt(i)-'0';
        }
        Arrays.sort(count);
        String grestest="0";
        for(int i = count.length-1 ; i >= 0 ;i--){
            if(Integer.parseInt(grestest) <= 200){
                grestest=grestest+count[i];
            }
        }
        return grestest;
    }
}
