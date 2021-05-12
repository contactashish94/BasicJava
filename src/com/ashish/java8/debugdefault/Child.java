package com.ashish.java8.debugdefault;

public interface Child extends Parent {

    @Override
    default void welcome(){
        message("Args passed from Child Interface");
    }

}
