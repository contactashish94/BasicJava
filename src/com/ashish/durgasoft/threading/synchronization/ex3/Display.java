package com.ashish.durgasoft.threading.synchronization.ex3;

public class Display {
    public synchronized void displayN(){
        for(int i = 0; i < 10; i ++){
            System.out.println(i);
            try {
                Thread.sleep(200);
            }catch(InterruptedException e){}
        }
    }
    public synchronized void displayC(){
        for(int i = 65; i < 75; i ++){
            System.out.println((char)i);
            try {
                Thread.sleep(200);
            }catch(InterruptedException e){}
        }
    }
}