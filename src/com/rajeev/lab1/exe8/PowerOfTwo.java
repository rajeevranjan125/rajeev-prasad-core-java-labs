package com.rajeev.lab1.exe8;

import java.util.Scanner;

public class PowerOfTwo {

    public boolean checkNumber(int n) {
        // Powers of two are positive numbers only
        if (n <= 0) {
            return false;
        }

        // Keep dividing by 2 until we get 1
        while (n > 1) {
            if (n % 2 != 0) {  // If not divisible by 2
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PowerOfTwo checker = new PowerOfTwo();

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println(checker.checkNumber(n));

        scanner.close();
    }
}