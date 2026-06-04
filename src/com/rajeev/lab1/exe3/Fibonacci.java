package com.rajeev.lab1.exe3;

public class Fibonacci {

    // Recursive method
    public int fibonacciRecursive(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive method
    public int fibonacciNonRecursive(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        int first = 1;
        int second = 1;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }

        return current;
    }

    public static void main(String[] args) {

        Fibonacci fib = new Fibonacci();

        int n = 7;

        System.out.println("Recursive: " + fib.fibonacciRecursive(n));
        System.out.println("Non-Recursive: " + fib.fibonacciNonRecursive(n));
    }
}