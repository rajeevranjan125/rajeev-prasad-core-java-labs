package com.rajeev.lab2.exe2;

import java.util.Arrays;

public class StringSorter {

    public String[] sortStrings(String[] arr) {

        Arrays.sort(arr);

        int mid = (arr.length % 2 == 0)
                ? arr.length / 2
                : (arr.length / 2) + 1;

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        String[] names = {"Rajeev", "Apple", "Mango", "Banana", "Orange"};

        StringSorter sorter = new StringSorter();

        String[] result = sorter.sortStrings(names);

        System.out.println(Arrays.toString(result));
    }
}