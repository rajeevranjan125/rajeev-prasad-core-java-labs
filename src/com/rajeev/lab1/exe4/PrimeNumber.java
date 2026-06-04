package com.rajeev.lab1.exe4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int limit = scanner.nextInt();

        if (limit < 2) {
            System.out.println("No prime numbers exist below 2.");
        } else {
            System.out.println("Prime numbers up to " + limit + ":");

            for (int i = 2; i <= limit; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime if divisible
            }
        }
        return true;
    }
}
