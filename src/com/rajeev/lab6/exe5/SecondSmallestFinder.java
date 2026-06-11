package com.rajeev.lab6.exe5;

import java.util.ArrayList;
import java.util.Collections;

public class SecondSmallestFinder {

    public static int getSecondSmallest(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        Collections.sort(list);

        return list.get(1);
    }

    public static void main(String[] args) {

        int[] numbers = {12, 5, 8, 1, 20};

        int secondSmallest = getSecondSmallest(numbers);

        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}