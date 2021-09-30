package com.ashish.test;

import java.util.Arrays;

public class Product {
    public static void main(String[] args) {
        int[] a = {2,3,4,5};
        int[] product=new int[a.length];
        int[] products_below = new int [a.length];
        int p=1;
        for(int i=0;i<a.length;++i) {
            products_below[i]=p;
            p=p*a[i];
        }
        int[] products_above =  new int[a.length];
        p=1;
        for(int i=a.length-1;i>=0;--i) {
            products_above[i]=p;
            p=p*a[i];
        }
        for(int i=0;i<a.length;++i) {
            product[i]=products_below[i]*products_above[i];
        }
        System.out.println(Arrays.toString(product));
    }
}