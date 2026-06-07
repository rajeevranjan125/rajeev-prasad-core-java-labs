package com.rajeev.lab2.exe3;

import java.util.Arrays;

public class NumberArrayProcessor {

    public int[] getSorted(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            String numStr = String.valueOf(numbers[i]);

            String reversedStr = new StringBuilder(numStr)
                    .reverse()
                    .toString();

            numbers[i] = Integer.parseInt(reversedStr);
        }

        Arrays.sort(numbers);

        return numbers;
    }

    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78};

        NumberArrayProcessor processor = new NumberArrayProcessor();

        int[] result = processor.getSorted(numbers);

        System.out.println(Arrays.toString(result));
    }
}