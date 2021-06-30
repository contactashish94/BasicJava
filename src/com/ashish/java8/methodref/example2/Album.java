package com.ashish.java8.methodref.example2;

import com.ashish.java8.methodref.Artist;

import java.util.List;
import java.util.stream.Stream;

public class Album {

	private String name;
	private List<Artist> musicians;

	public Stream<Artist> getMusicians() {
		return musicians.stream();
	}

	public void setMusicians(List<Artist> musicians) {
		this.musicians = musicians;
	}

	public Album(String name ) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist getMainMusician() {
		return musicians.get(0);
	}
	

}
