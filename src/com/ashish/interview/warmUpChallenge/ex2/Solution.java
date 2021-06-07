package com.ashish.interview.warmUpChallenge.ex2;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int steps = Integer.parseInt(bufferedReader.readLine().trim());

        //String path = bufferedReader.readLine();

        //int result = Result.countingValleys(steps, path);

       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();

        Scanner sc = new Scanner(System.in);
        int tesctCase = Integer.parseInt(sc.nextLine());
        int n = tesctCase;
        String str=null;
        if (tesctCase > 0){
            str = sc.next();
        }
        if(str!=null){
            int result = Result.countingValleys(tesctCase, str);
        }
    }
}
class Result{
    public static int countingValleys(int n, String path){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('U',1);
        map.put('D',-1);
        char[] ch = path.toUpperCase().toCharArray();
        int level =0;
        int valleyCount =0;
        for (char step : ch) {
            level += map.get(step);
            if(level==0 && step=='U'){
                valleyCount++;
            }

        }
        System.out.println(valleyCount);
        return valleyCount;

    }
}