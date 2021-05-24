package com.ashish.datastructure.recursion.arrays;

public class TwoDArray {
    int[][] arr=null;
    int row;
    int column;
    public TwoDArray(int row,int column){
        this.row=row;
        this.column=column;
        arr=new int[row][column];
        for(int i = 0; i < row;i++){
            for(int j = 0;j<column;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
    }
    public void traverse2DArray(){
        if(this.arr!=null){
            for(int i = 0; i < row;i++){
                for(int j = 0;j<column;j++){
                    System.out.print(arr[i][j]+"   ");
                }
                System.out.println();
            }
            System.out.println("\n");
        }
        else {
            System.out.println("Array Doesn't not exist");
        }
    }

    public String findIndex(int value){
        for(int i = 0; i < row;i++){
            for(int j = 0;j<column;j++){
                if(arr[i][j]==value){
                    return i+","+j;
                }
            }
        }
        return null;
    }

    public void setValueAT(int row,int column,int value){
        arr[row][column]=value;
    }

    public int valueAT(int row, int column){
        return arr[row][column];
    }

    public void deleteArray(){
        arr=null;
        //System.gc();
        System.out.println("Successfully deleted");
    }
}
