package com.ashish.interview.hackerrank.regexstudy.regex.ex3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution{
    public static void main(String[] args){
                                     //<([^>]+)>([^<>]+)</\\1>
        Pattern p = Pattern.compile("<([^>]+)>([^<>]+)</\\1>");

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            Matcher m = p.matcher(line);

            boolean check=true;
            while (m.find( )){
                System.out.println(m.group(2));
                check = false;
            }
            if(check){
                System.out.println("None");
            }
            testCases--;
        }
    }
}
