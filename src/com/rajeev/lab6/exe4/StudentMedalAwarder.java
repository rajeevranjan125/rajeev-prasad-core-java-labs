package com.rajeev.lab6.exe4;

import java.util.HashMap;
import java.util.Map;

public class StudentMedalAwarder {

    public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> marks) {

        HashMap<Integer, String> medals = new HashMap<>();

        for (Map.Entry<Integer, Integer> entry : marks.entrySet()) {

            int regNo = entry.getKey();
            int score = entry.getValue();

            if (score >= 90) {
                medals.put(regNo, "Gold");
            } else if (score >= 80) {
                medals.put(regNo, "Silver");
            } else if (score >= 70) {
                medals.put(regNo, "Bronze");
            }
        }

        return medals;
    }

    public static void main(String[] args) {

        HashMap<Integer, Integer> marks = new HashMap<>();

        marks.put(101, 95);
        marks.put(102, 85);
        marks.put(103, 75);
        marks.put(104, 65);

        HashMap<Integer, String> result = getStudents(marks);

        System.out.println(result);
    }
}