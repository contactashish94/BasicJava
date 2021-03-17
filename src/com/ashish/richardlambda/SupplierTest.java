package com.ashish.richardlambda;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<String> testSupplier = () -> {

            String str = "abcd_...";
            String str1 = "abcd-.....";
            String str2 = "abcd-........";
            String str3 = "abcd-..........";
            return  str+str1+str2+str3;
        };
        String str = testSupplier.get();

        System.out.println("Value returned from Class is "+ str);
    }
}
