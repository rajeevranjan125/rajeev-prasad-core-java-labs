package com.rajeev.lab6.exe3;

import java.util.HashMap;
import java.util.Map;

public class NumberSquaresMap {

    public static Map<Integer, Integer> getSquares(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, num * num);
        }

        return map;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6};

        Map<Integer, Integer> result = getSquares(numbers);

        System.out.println(result);
    }
}