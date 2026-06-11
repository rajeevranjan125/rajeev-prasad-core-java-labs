package com.rajeev.lab9.exe2;

import java.util.Scanner;

public class JobSeekerValidator {

    public static boolean validateUsername(String username) {
        return username.matches(".{8,}_job");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.println(validateUsername(username));

        sc.close();
    }
}