package com.rajeev.lab3.exe5;

import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text (type END on a new line to finish):");

        StringBuilder text = new StringBuilder();
        int lineCount = 0;

        while (true) {

            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("END")) {
                break;
            }

            text.append(line).append("\n");
            lineCount++;
        }

        String content = text.toString();

        int charCount = content.length();

        int wordCount = 0;
        if (!content.trim().isEmpty()) {
            wordCount = content.trim().split("\\s+").length;
        }

        System.out.println("Number of Characters : " + charCount);
        System.out.println("Number of Words      : " + wordCount);
        System.out.println("Number of Lines      : " + lineCount);

        scanner.close();
    }
}