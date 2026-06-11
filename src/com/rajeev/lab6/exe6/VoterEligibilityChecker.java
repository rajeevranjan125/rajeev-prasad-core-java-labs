package com.rajeev.lab6.exe6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoterEligibilityChecker {

    public static List<Integer> votersList(Map<Integer, Integer> map) {

        List<Integer> voters = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int id = entry.getKey();
            int age = entry.getValue();

            if (age > 18) {
                voters.add(id);
            }
        }

        return voters;
    }

    public static void main(String[] args) {

        Map<Integer, Integer> persons = new HashMap<>();

        persons.put(101, 25);
        persons.put(102, 17);
        persons.put(103, 30);
        persons.put(104, 18);
        persons.put(105, 22);

        List<Integer> result = votersList(persons);

        System.out.println(result);
    }
}