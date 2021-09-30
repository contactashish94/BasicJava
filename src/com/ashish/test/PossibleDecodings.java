package com.ashish.test;

public class PossibleDecodings {
    public static void main(String[] args) {
        String s = "1234";//{ABCD..1234},{L,C,D...12,3,4},{A,W,D...1,23,4}
        System.out.println(totalPossibleDecoding(s));
    }
    static int totalPossibleDecoding(String s) {
        if(s.length()==0 || s.charAt(0)=='0'){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int count1=1,count2=1;
        for(int i = 1 ; i<s.length();++i){
            int d = s.charAt(i)-'0';
            int dd = (s.charAt(i-1) - '0')*10 + d;
            int count = 0;
            if(d > 0){
                count = count+count2;
            }
            if(dd >=10 && dd <= 26){
                count = count+count1;
            }
            count1=count2;
            count2=count;
        }
        return count2;
    }
}
