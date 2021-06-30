package com.ashish.practiceinterview.duplicatechars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateChars {
    public static void main(String[] args) {
        String abc = "aabbcdd";
        HashMap<Character, Integer> map = new LinkedHashMap<>(abc.length());
        ArrayList<Character> list = new ArrayList<>();
        for(char ch : abc.toCharArray()){
            map.put(ch, map.containsKey(ch) ? map.get(ch)+1 : 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                list.add(entry.getKey());
            }
        }
        System.out.println(list);

    }
}
