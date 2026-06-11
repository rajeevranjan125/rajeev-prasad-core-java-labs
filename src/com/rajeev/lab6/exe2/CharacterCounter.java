package com.rajeev.lab6.exe2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {

    public static Map<Character, Integer> countChars(char[] arr) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'a', 'b', 'a'};

        Map<Character, Integer> result = countChars(arr);

        System.out.println(result);
    }
}