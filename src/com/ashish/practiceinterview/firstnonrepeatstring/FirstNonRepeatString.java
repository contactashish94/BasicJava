package com.ashish.practiceinterview.firstnonrepeatstring;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(printFirstNonRepeatChar(word));
    }

    private static char printFirstNonRepeatChar(String word) {
        HashMap<Character, Integer> map = new LinkedHashMap<>(word.length());
        char nonrepeat = '\0';
        for (char c : word.toCharArray()) {
            map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                nonrepeat = entry.getKey();
                break;
            }
        }
        /*Map<Character, Integer> counts = new LinkedHashMap<>(word.length());
        for (char c : word.toCharArray()) {
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                return entry.getKey();
            }
        }
        return '\0';*/
        return nonrepeat;
    }
}
