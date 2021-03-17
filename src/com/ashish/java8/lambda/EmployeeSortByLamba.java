package com.ashish.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortByLamba {

    public static void main(String[] args) {
        Employee emp = new Employee("Gayle", 21);
        Employee emp2 = new Employee("Chris", 22);
        Employee emp3 = new Employee("Aka", 23);
        Employee emp4 = new Employee("Charchil", 24);

        List<Employee> listEmp = new ArrayList<Employee>();

        listEmp.add(emp);
        listEmp.add(emp2);
        listEmp.add(emp3);
        listEmp.add(emp4);
        System.out.println("Before sorting in Java 8");
        for (Employee employee: listEmp) {
            System.out.println(employee.getName());
        }

        Collections.sort(listEmp,(employee1, employee2) ->
            employee1.getName().compareTo(employee2.getName()));

        System.out.println("----------After sorting in Lambda-----------");
        for (Employee employee: listEmp) {
            System.out.println(employee.getName());
        }
    }
}
