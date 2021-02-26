package com.ashish.interview;

public class DoWhile {
    public static void main(String[] args) {

        String str = "abcd,efgh";
        String str1[] = str.split(",");
        System.out.println(str1[0]);
        System.out.println(str1[1]);

            int number = 4;
            int finishNum = 20;

            while (number <= finishNum) {
                number++;
                if(!isEvenNumber(number)){
                    continue;
                }
                System.out.println("Even Number " + number);

            }
    }
    private static boolean isEvenNumber(int n){
        if (n % 2==0) return true;
        else return false;
    }
}
