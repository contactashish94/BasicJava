package com.ashish.java8.parralelism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Parallelism {
    public static void main(String[] args) {

        Set<String> trackNames = new HashSet<>();

        List<Track> tracks = new ArrayList<>();

        Track track1 = new Track("Tere Bina", 123);
        Track track2 = new Track("Tum Bin", 124);
        Track track3 = new Track("Tere Naam", 67);
        Track track4 = new Track("Chand Chupa Badal me", 599);
        Track track5 = new Track("Humnava", 69);

        tracks.add(track1);
        tracks.add(track2);
        tracks.add(track3);
        tracks.add(track4);
        tracks.add(track5);

        Album album1 = new Album("Romance", tracks);


        List<Album> albums = new ArrayList<>();
        albums.add(album1);

        albums.stream().flatMap(album -> album.getTracks())
                .filter(track -> track.getLength()>60)
                .map(track -> track.getName())
                .forEach(name -> trackNames.add(name));

        System.out.println(trackNames);
        Stream<Track> streamObject = albums.stream().flatMap(album -> album.getTracks());



        //streamObject.parallel().


    }
}

class Album{
    private String name;
    private List<Track> tracks;

    public Album(String name, List<Track> tracks) {
        this.name = name;
        this.tracks = tracks;
    }

    public String getName() {
        return name;
    }

    public Stream<Track> getTracks() {
        return tracks.stream();
    }
}

class Track{
    private String name;
    private int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }
}