package com.ashish.datastructure.divideandconquer;

public class MyZeroOneKnapSack {

    public int knapsack(int[] profits, int[] weights, int capacity) {
        return this.myKnapSackAux(profits, weights, capacity, 0);
    }

    private static int myKnapSackAux(int[] profits, int[] weights, int capacity, int currentIndex) {
        if (capacity <= 0 || currentIndex >= profits.length || currentIndex < 0) {
            return 0;
        }
        int profit1 = 0;
        if (weights[currentIndex] <= capacity)
        profit1 = profits[currentIndex] + myKnapSackAux(profits, weights, capacity - weights[currentIndex], currentIndex + 1);

        int profit2 = myKnapSackAux(profits, weights, capacity, currentIndex + 1);

        return Math.max(profit1, profit2);

    }


    public static void main(String[] args) {
        MyZeroOneKnapSack ks = new MyZeroOneKnapSack();
        int[] profits = { 31, 26, 72, 17 };
        int[] weights = { 3, 1, 5, 2 };
        int maxProfit = ks.knapsack(profits, weights, 7);
        System.out.println(maxProfit);
    }

}
