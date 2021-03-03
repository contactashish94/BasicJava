package com.ashish.interview;

import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //boolean first = true;

        while(true) {
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();

                /*if(first){
                    first= false;
                    min = number;
                    max = number;
               }*/

                if(number > max) {
                    max = number;
                } if (number < min) {
                    min = number;
                }
            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min was " + min + " & " + "max was " + max);
        scanner.close();
    }
}
