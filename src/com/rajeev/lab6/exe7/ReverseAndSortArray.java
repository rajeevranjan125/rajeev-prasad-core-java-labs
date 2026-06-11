package com.rajeev.lab6.exe7;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAndSortArray {

    public static int[] getSorted(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            String reversed = new StringBuilder(String.valueOf(num)).reverse().toString();
            list.add(Integer.parseInt(reversed));
        }

        Collections.sort(list);

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78};

        int[] result = getSorted(numbers);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}