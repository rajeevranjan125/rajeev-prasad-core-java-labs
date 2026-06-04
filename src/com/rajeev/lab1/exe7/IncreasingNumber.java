package com.rajeev.lab1.exe7;

import java.util.Scanner;

public class IncreasingNumber {

    public boolean checkNumber(int number) {
        String numStr = Integer.toString(number);

        // Compare each digit with the next digit
        for (int i = 0; i < numStr.length() - 1; i++) {
            int currentDigit = numStr.charAt(i) - '0';
            int nextDigit = numStr.charAt(i + 1) - '0';

            // If current digit is greater than next digit, not increasing
            if (currentDigit > nextDigit) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IncreasingNumber checker = new IncreasingNumber();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println(checker.checkNumber(number));

        scanner.close();
    }
}