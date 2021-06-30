package com.ashish.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        StringTokenizer array = new StringTokenizer(in.readLine());
        ArrayList<Integer> a = new ArrayList<Integer>(N);
        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(array.nextToken()));
        }
        List<Integer> subListOne = a.subList(0, (N - (K % N)));
        a.addAll(subListOne);

        // Queries
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int x = Integer.parseInt(in.readLine());
            output.append(a.get(x + (N - (K % N)))).append("\n");
        }
        System.out.print(output.toString());
    }
}
