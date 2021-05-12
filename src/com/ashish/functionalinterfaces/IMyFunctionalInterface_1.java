package com.ashish.functionalinterfaces;

import java.util.ArrayList;

@FunctionalInterface
public interface IMyFunctionalInterface_1 {

    public void mapRequest(ArrayList arrayList);

    public default void println(){
        System.out.println("Default in Interface");
    }
}
