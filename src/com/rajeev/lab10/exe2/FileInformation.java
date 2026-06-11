package com.rajeev.lab10.exe2;

import java.io.File;
import java.util.Scanner;

public class FileInformation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        System.out.println("File Exists: " + file.exists());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());

        if (file.isFile()) {
            System.out.println("Type: Regular File");
        } else if (file.isDirectory()) {
            System.out.println("Type: Directory");
        } else {
            System.out.println("Type: Unknown");
        }

        System.out.println("Length: " + file.length() + " bytes");

        sc.close();
    }
}