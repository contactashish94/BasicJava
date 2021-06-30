package com.ashish.practiceinterview.numbercheckinstring;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberValidator {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //String input = sc.next();
        Pattern pattern = Pattern.compile("-?[0-9]+");
        //Pattern pattern = Pattern.compile("^-?[0-9]\\d*(\\.\\d+)?$");
        String [] inputs = {"123", "-123" , "123.12", "abcd123"};

        for (String input: inputs) {
            if(pattern.matcher(input).matches()){
                System.out.println("Matches for: " +input);
            }
        }


    }
}
