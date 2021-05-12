package com.ashish.durgasoft.threading.synchronization.ex2;

public class Display {
    public void wish(String name){
        for(int i = 0; i < 10; i ++){
            System.out.print("Good Morning:");
            try {
                Thread.sleep(20);
            }catch(InterruptedException e){}
            System.out.println(name);
        }
    }
    public static synchronized void wishSynchMorning(String name){
        System.out.println("Test Up");
        System.out.println("Test Up");
        System.out.println("Test Up");
        System.out.println("Test Up");
        System.out.println("Test Up");
        System.out.println("Test Up");
        for(int i = 0; i < 10; i ++){
            System.out.print("Good Morning:");
            try {
                Thread.sleep(20);
            }catch(InterruptedException e){}
            System.out.println(name);
        }
        System.out.println("Test Down");
        System.out.println("Test Down");
        System.out.println("Test Down");
        System.out.println("Test Down");
        System.out.println("Test Down");
        System.out.println("Test Down");
    }
}