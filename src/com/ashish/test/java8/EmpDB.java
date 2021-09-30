package com.ashish.test.java8;

import java.util.ArrayList;
import java.util.List;

public class EmpDB {
    static List<Emp> empList= new ArrayList<>();
    static List<Emp> getEmpList(){
        for(int i = 0;i<1000;i++){
            empList.add(new Emp(i,"emp"+i));
        }
        return empList;
    }
}
