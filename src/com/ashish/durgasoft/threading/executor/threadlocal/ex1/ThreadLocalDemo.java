package com.ashish.durgasoft.threading.executor.threadlocal.ex1;

public class ThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal()
        {
            public Object initialValue () {
            return "abc";
        }
        };
    }
}
