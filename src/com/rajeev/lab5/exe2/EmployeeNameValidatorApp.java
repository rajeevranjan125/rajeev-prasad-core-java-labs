package com.rajeev.lab5.exe2;

import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class EmployeeNameValidatorApp {

    public static void validateName(String firstName, String lastName)
            throws InvalidNameException {

        if (firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
            throw new InvalidNameException("First Name and Last Name cannot be blank.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        try {
            validateName(firstName, lastName);
            System.out.println("Employee Name: " + firstName + " " + lastName);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}