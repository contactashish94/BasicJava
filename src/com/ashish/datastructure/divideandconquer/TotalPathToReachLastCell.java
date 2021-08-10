package com.ashish.datastructure.divideandconquer;

public class TotalPathToReachLastCell {
    public static void main(String[] args) {
        {
            int[][] array = {
                    { 4, 7, 1, 6 },
                    { 5, 7, 3, 9 },
                    { 3, 2, 1, 2 },
                    { 7, 1, 6, 3 } };
            int cost = 25;
            TotalPathToReachLastCell nop = new TotalPathToReachLastCell();
            System.out.println("Total paths with cost " + cost + " are " + nop.numberOfPaths(array, array.length - 1, array[0].length - 1, cost));
        }
    }

    private static int numberOfPaths(int[][] arr, int r, int c, int cost){
        if(cost < 0){
            return 0;
        }
        if (r == 0 && c == 0){
            return arr[r][c] -cost == 0 ? 1 : 0;
        }
        if (r == 0) {
            return numberOfPaths(arr, r, c-1,cost-arr[r][c]);
        }
        if (c ==0){
            return numberOfPaths(arr,r-1,c,cost-arr[r][c]);
        }
        int numPathFromPrevRow = numberOfPaths(arr, r-1,c,cost-arr[r][c]);
        int numPathFromPrevcol = numberOfPaths(arr, r,c-1,cost-arr[r][c]);

        return numPathFromPrevcol + numPathFromPrevRow;
    }


}
