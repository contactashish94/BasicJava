package com.ashish.richardlambda;

import com.ashish.functionalinterfaces.IMyFunctionalInterface_1;

import java.util.ArrayList;

public class IMyFunctionalInterface_1_Test {

    public static void main(String[] args) {
        IMyFunctionalInterface_1 test = input -> System.out.println("Mapping Done");
        ArrayList list = new ArrayList();
        test.mapRequest(list);
    }
}
