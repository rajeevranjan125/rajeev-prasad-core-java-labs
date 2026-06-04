package com.rajeev.lab1.exe6;

import java.util.Scanner;

public class NaturalNumbersDifference {

    public int calculateDifference(int n) {
        // Formula: sum of squares = n(n+1)(2n+1)/6
        int sumOfSquares = n * (n + 1) * (2 * n + 1) / 6;

        // Formula: sum of n numbers = n(n+1)/2
        int sum = n * (n + 1) / 2;
        int squareOfSum = sum * sum;

        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaturalNumbersDifference calculator = new NaturalNumbersDifference();

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.println("Difference: " + calculator.calculateDifference(n));

        scanner.close();
    }
}
