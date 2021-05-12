package com.ashish.java8streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Ex1 {
    public static void main(String[] args) {

        List<Artist> artistList = new ArrayList<Artist>();
        ArrayList<String> list = new ArrayList<>();
        artistList.add(new Artist("london"));
        artistList.add(new Artist("NYK"));
        artistList.add(new Artist("Patna"));
        artistList.add(new Artist("Dehradun"));
        artistList.add(new Artist("Delhi"));
        artistList.add(new Artist("Delhi"));

        list.add("India");

        //int x = (int)list.stream().filter(str -> str.isf).count();
        int x1 = (int)list.stream().count();
        System.out.println("Total elements --> " + x1);

        System.out.println("Total from london -> " + artistList.stream().filter(artist -> {
            System.out.println("City --> " + artist.getCity());
            return artist.isFrom("");
        }).count());
        System.out.println("Total from India -> " + list.stream().filter(str -> str.contains("India")).count());

        artistList.stream().filter(artist -> {
            //System.out.println(artist.getCity());
            return artist.isFrom("Delhi");
        });

        artistList.stream().filter(artist -> {
            //System.out.println(artist.getCity());
            return artist.isFrom("Dehradun");
        });
    }
}
class Artist {
    String city;

    public String getCity() {
        return city;
    }

    public Artist(String city){

        this.city = city;
    }
    public boolean isFrom(String location){
        if(city.equalsIgnoreCase(location)){
            return true;
        }
        return false;
    }
}
