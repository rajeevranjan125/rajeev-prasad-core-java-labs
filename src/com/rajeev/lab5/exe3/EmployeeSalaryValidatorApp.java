package com.rajeev.lab5.exe3;

import java.util.Scanner;

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeSalaryValidatorApp {

    public static void validateSalary(Employee emp)
            throws EmployeeException {

        if (emp.getSalary() < 3000) {
            throw new EmployeeException(
                    "Salary of employee " + emp.getName() + " is below 3000."
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(id, name, salary);

        try {
            validateSalary(emp);
            System.out.println("Employee details are valid.");
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}