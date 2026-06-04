package com.rajeev.lab1.exe1;

public class SumOfCubesOfDigit {

    public int sumOfCubesOfDigit(int n) {

        int sum = 0;
        boolean negative = false;

        //handling edge case
        if (n < 0) {
            n = -n;
            negative = true;
        }

        while (n != 0) {

            int rem = n % 10;
            sum += rem * rem * rem;
            n = n / 10;
        }

        if (negative) {
            return -sum;
        }

        return sum;
    }

    public static void main(String[] args) {

        SumOfCubesOfDigit num = new SumOfCubesOfDigit();

        int sumOfCubeOfDigit1 = num.sumOfCubesOfDigit(0);
        int sumOfCubeOfDigit2 = num.sumOfCubesOfDigit(226);
        int sumOfCubeOfDigit3 = num.sumOfCubesOfDigit(-226);

        System.out.println(sumOfCubeOfDigit1);
        System.out.println(sumOfCubeOfDigit2);
        System.out.println(sumOfCubeOfDigit3);
    }
}
