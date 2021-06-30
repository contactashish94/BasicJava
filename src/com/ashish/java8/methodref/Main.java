package com.ashish.java8.methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	static void m1() {
		System.out.println("Void m1");
	}
	
	public static void main(String[] args) {
		Parent parent = Main::new;
		Parent parent1 = Main::m1;
		
		parent.m1();

		Artist artist = new Artist("Ashish","India");
		Artist artist1 = new Artist("Michael","US");
		Artist artist2 = new Artist("Enrique","Spain");

		List<Artist> list = new ArrayList<>();
		list.add(artist);
		list.add(artist1);
		list.add(artist2);

		System.out.println(list);
		List<String> list1 = list.stream().map(art -> art.getName()).sorted().collect(Collectors.toList());
		System.out.println(list1);

	}

}
