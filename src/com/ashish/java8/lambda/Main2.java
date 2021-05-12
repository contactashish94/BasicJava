package com.ashish.java8.lambda;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
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

		String silString = doStringStuff(new UpperConcat() {
			@Override
			public String uppserAdConcat(String s1, String s2) {
				return s1.toUpperCase()+s2.toLowerCase();
			}
		},listEmp.get(0).getName(), listEmp.get(1).getName());

		System.out.println(silString);
		System.out.println("------------------Doing by Lambda Expressions------------------");

		UpperConcat uc = (s1, s2) -> s1.toUpperCase()+ " --- "+s2.toUpperCase();

		String sillStr2 = doStringStuff(uc, listEmp.get(0).getName(),listEmp.get(1).getName());

		System.out.println(sillStr2);



	}

	public final static String doStringStuff(UpperConcat uc, String s1, String s2){
		return uc.uppserAdConcat(s1,s2);
	}
}
