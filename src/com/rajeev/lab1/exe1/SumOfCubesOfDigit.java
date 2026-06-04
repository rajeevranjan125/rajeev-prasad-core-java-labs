package com.rajeev.lab1.exe1;

public class SumOfCubesOfDigit {

    public int sumOfCubesOfDigit(int n) {

        //write your code
        int sum = 0;

        while (n > 1) {

            int rem = n % 10;
            int cubeOfDigit = rem * rem * rem;
            sum += cubeOfDigit;
            n = n / 10;
        }

        sum += n;

        return sum;
    }

    public static void main(String[] args) {

        SumOfCubesOfDigit num = new SumOfCubesOfDigit();

        int sumOfCubeOfDigit = num.sumOfCubesOfDigit(222);

        System.out.println(sumOfCubeOfDigit);
    }
}
