package com.ashish.durgasoft.threading.synchronization.block;

public class Display {
    public void wish(String name, Thread t){
        synchronized (Display.class){
            for (int i = 0;i<10;i++){
                System.out.print("Good Morning: ");
                try {
                    Thread.sleep(20);
                } catch(InterruptedException e){}
                System.out.println(name+" ---> "+ t.getName());
            }
        }
    }
}
