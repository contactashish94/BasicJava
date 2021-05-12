package com.ashish.functionalinterfaces;

import java.util.ArrayList;

public class Main implements IMyFunctionalInterface_1 {
    @Override
    public void mapRequest(ArrayList arrayList) {

    }

    @Override
    public void println() {
        System.out.println("Intrefcae child");
    }

    public static void main(String[] args) {
        Main m = new Main();

        m.println();
    }
}
