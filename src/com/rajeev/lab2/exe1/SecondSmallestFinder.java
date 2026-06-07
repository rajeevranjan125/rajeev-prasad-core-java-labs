package com.rajeev.lab2.exe1;

import java.util.Arrays;

public class SecondSmallestFinder {

    public int getSecondSmallest(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[1];
    }

    public static void main(String[] args) {
        int[] numbers = {12, 5, 8, 1, 20, 3};

        SecondSmallestFinder finder = new SecondSmallestFinder();

        int secondSmallest = finder.getSecondSmallest(numbers);

        System.out.println("Second Smallest Element: " + secondSmallest);
    }
}