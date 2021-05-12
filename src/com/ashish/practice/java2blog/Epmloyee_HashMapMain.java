package com.ashish.practice.java2blog;

import java.util.HashMap;
        import java.util.Map;

public class Epmloyee_HashMapMain {

    public static void main(String[] args) {
        int index = 12342445 & (15);
        System.out.println("Index -> " + index);
        Employee emp1=new Employee("Martin",27);
        Map<Employee,String> hm=new HashMap<Employee,String>();
        hm.put(emp1, "Verified");
        emp1.setName("John");
        System.out.println(hm.get(emp1));
        if("abc"=="abc" ^ "abcd"=="abcd" ){

        }
    }
}