package com.ashish.java8.devoxx.designappeternsclass;


import java.util.function.Supplier;

class Lazy<T>{
private T instance;
private Supplier<T> supplier;
public Lazy(Supplier<T> theSupplier){
    supplier = theSupplier;
}
public T get(){
    if(instance == null){
        instance = supplier.get();
        supplier = null;
    }
    return instance;
}

}
public class Sample1 {



    public static int comput(int n){
        System.out.println("called");
        return n*2;
    }
    public static void main(String[] args) {
        int x = 4;
        int temp = comput(x);
        //int temp = new Lazy(() -> comput(x));
        if(x >5 && temp> 7){
            System.out.println("called..1");
        }
        else{
            System.out.println("called..2");
        }


    }
}
