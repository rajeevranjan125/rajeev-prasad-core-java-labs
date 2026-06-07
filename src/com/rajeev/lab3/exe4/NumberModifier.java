package com.rajeev.lab3.exe4;

public class NumberModifier {

    public int modifyNumber(int number1) {

        String number = String.valueOf(number1);

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < number.length() - 1; i++) {

            int currentDigit = number.charAt(i) - '0';
            int nextDigit = number.charAt(i + 1) - '0';

            result.append(Math.abs(currentDigit - nextDigit));
        }

        result.append(number.charAt(number.length() - 1));

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {

        NumberModifier modifier = new NumberModifier();

        System.out.println(modifier.modifyNumber(45862));
    }
}