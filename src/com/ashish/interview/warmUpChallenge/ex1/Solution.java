package com.ashish.interview.warmUpChallenge.ex1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        //List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //.map(Integer::parseInt)
        //.collect(Collectors.toList());
        Scanner sc = new Scanner(System.in);
        List<Integer> ar = new ArrayList<>();
        int tesctCase = Integer.parseInt(sc.nextLine());
        int n = tesctCase;
        while (tesctCase > 0) {
            ar.add(sc.nextInt());
            tesctCase--;
        }


        int result = Result.sockMerchant(n, ar);
        System.out.println("result--- " + result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}

class Result {

    public static int sockMerchant(int n, List<Integer> ar) {

        Collections.sort(ar);
        int count = 0;
        n = ar.size();
        /*for (int i = 0; i < ar.size() - 1; i++) {
            int size = ar.size();
            if (i + 1 == size) {
                ar.remove(ar.get(0));
                break;
            } else if (ar.get(0) != ar.get(1)) {
                ar.remove(ar.get(0));
            } else if (ar.get(0) == ar.get(1)) {
                ar.remove(ar.get(1));
                ar.remove(ar.get(0));
                count++;
            }
        }*/
        for(int i = 1; i < ar.size();i++){
            if(ar.get(i-1).equals(ar.get(i))){
                count++;
                ar.remove(i-1);
            }
        }
        System.out.println("Total count : " + count);
        return count;
    }
}