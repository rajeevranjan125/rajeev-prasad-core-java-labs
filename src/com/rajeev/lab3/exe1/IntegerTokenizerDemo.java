package com.rajeev.lab3.exe1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerTokenizerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers separated by spaces:");

        String input = scanner.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(input);

        int sum = 0;

        while (tokenizer.hasMoreTokens()) {

            int number = Integer.parseInt(tokenizer.nextToken());

            System.out.println("Integer: " + number);

            sum += number;
        }

        System.out.println("Sum of Integers = " + sum);

        scanner.close();
    }
}