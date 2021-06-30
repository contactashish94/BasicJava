package com.ashish.interview.interviewkit.persistent;

public class SelfMinJump {
    public static void main(String[] args) {
        int[] arr = new int[40000];
        int i=0;
        while (i<40000){
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
        int arr2[] = {2, 3, 1, 1, 4,2, 3, 1, 1, 4};
        int r[] = new int[arr.length];
        System.out.println(System.currentTimeMillis());
        System.out.println("From Self Method : " + countMinJump(arr2));
        System.out.println(System.currentTimeMillis());
        /*System.out.println("From Git Method : " + minJump(arr, r));
        System.out.println(System.currentTimeMillis());*/
    }

    static int countMinJump(int[] arr) {
        int step = 0, n = arr.length, start = 0, maxend = 0, maxindex = 0;
        int i = 0;
        while (start < n - 1) {
            System.out.println("While Loop");
            step++;
            for (i = maxindex; i <= start; i++) {
                System.out.println("For Loop");
                if (i + arr[i] > maxend) {
                    maxend = i + arr[i];
                    maxindex = i;
                }
                if (maxend >= n - 1) return step;
            }
            start = maxend;
        }
        return n == 1 ? 0 : -1;
    }

    public static int minJump(int arr[], int result[]) {

        int[] jump = new int[arr.length];
        jump[0] = 0;
        for (int i = 1; i < arr.length; i++) {
            jump[i] = Integer.MAX_VALUE - 1;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] + j >= i) {
                    if (jump[i] > jump[j] + 1) {
                        result[i] = j;
                        jump[i] = jump[j] + 1;
                    }
                }
            }
        }

        return jump[jump.length - 1];
    }
}
