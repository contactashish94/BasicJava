package com.ashish.java8.methodref.example2;

import com.ashish.java8.methodref.Artist;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
    	
    	List<Album> listAlbum = new ArrayList<>();
    	List<Album> listAlbum1 = new ArrayList<>();
    	List<Album> listAlbum2 = new ArrayList<>();
    	
    	listAlbum.add(new Album("ABCD"));
    	listAlbum.add(new Album("ABCD_1"));
    	listAlbum.add(new Album("ABCD_2"));
    	
    	listAlbum1.add(new Album("Hello"));
    	listAlbum1.add(new Album("Hello_1"));
    	listAlbum1.add(new Album("Hello_2"));
    	
    	listAlbum2.add(new Album("Final"));
    	listAlbum2.add(new Album("Final_1"));
    	listAlbum2.add(new Album("Final_2"));
    	
    	
        Map<Artist, List<Album>> mapByList = new HashMap<>();
        
        mapByList.put(new Artist("Enrique", "Spain"), listAlbum);
        mapByList.put(new Artist("Honey", "India"), listAlbum1);
        mapByList.put(new Artist("Rock", "US"), listAlbum2);
        
        
        Map<Artist, List<String>> mapByString = new HashMap<>();	
        for (Entry<Artist, List<Album>> entry : mapByList.entrySet()) {
				mapByString.put(entry.getKey(), entry.getValue()
												.stream()
												.map(Album::getName)
												.collect(Collectors.toList()));
		}
        
        
        System.out.println(mapByString);
    }
    
    public Map<Artist, List<String>> getMainMusician(Stream<Album> albums){

    	return albums.collect(groupingBy
								(Album::getMainMusician,
											mapping(Album::getName,
													toList())));
    }
}
