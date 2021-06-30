package com.ashish.datastructure.divideandconquer;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = new int[6700];
        int i=0;
        while (i<6700){
            for (int j = 0 ; j <= 9;j++){
                switch (j){
                    case 0:
                        arr[i]=2;
                        i++;
                        break;
                    case 1:
                        arr[i]=3;
                        i++;
                        break;
                    case 2:
                        arr[i]=1;
                        i++;
                        break;
                    case 3:
                        arr[i]=1;
                        i++;
                        break;
                    case 4:
                        arr[i]=2;
                        i++;
                        break;
                    case 5:
                        arr[i]=4;
                        i++;
                        break;
                    case 6:
                        arr[i]=2;
                        i++;
                        break;
                    case 7:
                        arr[i]=0;
                        i++;
                        break;
                    case 8:
                        arr[i]=1;
                        i++;
                        break;
                    case 9:
                        arr[i]=1;
                        i++;
                        break;
                }
            }
        }


        int max = DAC_Max(arr, 0, arr.length);
        System.out.println("Max Number : = " + max);
    }


    static int DAC_Max(int a[], int index, int sizeOfArray) {
        System.out.println("Method execution");
        int max;

        if (index >= sizeOfArray - 2) {
            if (a[index] > a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        // Logic to find the Maximum element
        // in the given array.
        max = DAC_Max(a, index + 1, sizeOfArray);
        if (a[index] > max)
            return a[index];
        else
            return max;
    }
}
