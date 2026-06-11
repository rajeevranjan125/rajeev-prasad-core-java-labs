package com.rajeev.lab6.exe1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class HashMapValuesSorter {

    public static List<String> getValues(HashMap<Integer, String> map) {
        List<String> list = new ArrayList<>(map.values());
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Rajeev");
        map.put(103, "Amit");
        map.put(102, "Karan");
        map.put(104, "Neha");

        List<String> sortedValues = getValues(map);

        System.out.println(sortedValues);
    }
}