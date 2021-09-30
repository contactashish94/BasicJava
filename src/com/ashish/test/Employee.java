package com.ashish.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee implements Comparator<Employee> {
    int custId;
    String custName;

    public Employee(int custId, String custName) {
        this.custId = custId;
        this.custName = custName;
    }

    public Employee() {
        super();
    }

    @Override
    public int compare(Employee e1, Employee e2) {
        int name = e1.custName.compareTo(e2.custName);
        return name == 0 ? e1.custId - e2.custId : name;
    }

    @Override
    public String toString() {
        return "{" + "custId=" + custId + ", custName=" + custName + '}';
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(123,"abcd"));
        employees.add(new Employee(234,"aber"));
        employees.add(new Employee(345,"abcdefg"));
        employees.add(new Employee(456,"abcd"));
        employees.add(new Employee(567,"abcd"));

        Collections.sort(employees,new Employee());

        System.out.println(employees);
    }
}
