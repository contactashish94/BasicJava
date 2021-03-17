package com.ashish.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

    public static void main(String[] args) {
        Employee emp = new Employee("Gayle", 21);
        Employee emp2 = new Employee("Chris", 22);
        Employee emp3 = new Employee("Ak", 23);
        Employee emp4 = new Employee("Charchil", 24);

        List<Employee> listEmp = new ArrayList<Employee>();

        listEmp.add(emp);
        listEmp.add(emp2);
        listEmp.add(emp3);
        listEmp.add(emp4);
        System.out.println("Before sorting");
        for (Employee employee: listEmp) {
            System.out.println(employee.getName());
        }

        Collections.sort(listEmp, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.getName().compareTo(employee2.getName());
            }
        });

        System.out.println("----------After sorting-----------");
        for (Employee employee: listEmp) {
            System.out.println(employee.getName());
        }
    }
}
