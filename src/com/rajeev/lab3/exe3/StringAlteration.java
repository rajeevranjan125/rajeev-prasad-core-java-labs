package com.rajeev.lab3.exe3;

public class StringAlteration {

    public String alterString(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (isConsonant(ch)) {
                result.append((char) (ch + 1));
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    private boolean isConsonant(char ch) {

        ch = Character.toLowerCase(ch);

        return Character.isLetter(ch)
                && ch != 'a'
                && ch != 'e'
                && ch != 'i'
                && ch != 'o'
                && ch != 'u';
    }

    public static void main(String[] args) {

        StringAlteration alteration = new StringAlteration();

        System.out.println(alteration.alterString("JAVA"));
    }
}