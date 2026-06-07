package com.rajeev.lab3.exe8;

public class PositiveStringChecker {

    public boolean isPositiveString(String str) {

        str = str.toUpperCase();

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        PositiveStringChecker checker = new PositiveStringChecker();

        System.out.println(checker.isPositiveString("ANT"));
        System.out.println(checker.isPositiveString("JAVA"));
    }
}