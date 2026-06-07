package com.rajeev.lab2.exe4;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ArrayModifier {

    public int[] modifyArray(int[] numbers) {

        Set<Integer> uniqueNumbers = new TreeSet<>((a, b) -> b - a);

        for (int number : numbers) {
            uniqueNumbers.add(number);
        }

        int[] result = new int[uniqueNumbers.size()];
        int index = 0;

        for (int number : uniqueNumbers) {
            result[index++] = number;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {4, 2, 6, 4, 3, 2, 8, 6};

        ArrayModifier modifier = new ArrayModifier();

        int[] result = modifier.modifyArray(numbers);

        System.out.println(Arrays.toString(result));
    }
}