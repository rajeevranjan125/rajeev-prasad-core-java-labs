package com.rajeev.lab1.exe5;

import java.util.Scanner;

public class NaturalNumbersSum {

    public int calculateSum(int n) {
        int sum = 0;
        int count = 0;

        for (int num = 1; count < n; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
                count++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        NaturalNumbersSum calculator = new NaturalNumbersSum();

        System.out.print("Enter n: ");

        int n = scanner.nextInt();

        System.out.println("Sum: " + calculator.calculateSum(n));

        scanner.close();
    }
}