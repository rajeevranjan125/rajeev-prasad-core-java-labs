package com.rajeev.lab4.exe2;

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    public void setInsuranceScheme(String insuranceScheme) {
        this.insuranceScheme = insuranceScheme;
    }
}

interface EmployeeService {
    void getEmployeeDetails(Employee emp);
    void findInsuranceScheme(Employee emp);
    void displayEmployee(Employee emp);
}

class EmployeeServiceImpl implements EmployeeService {

    public void getEmployeeDetails(Employee emp) {
    }

    public void findInsuranceScheme(Employee emp) {
        double salary = emp.getSalary();
        String designation = emp.getDesignation();

        if (salary >= 5000 && designation.equalsIgnoreCase("Manager")) {
            emp.setInsuranceScheme("Scheme A");
        } else if (salary >= 3000 && designation.equalsIgnoreCase("Programmer")) {
            emp.setInsuranceScheme("Scheme B");
        } else if (salary < 3000 && designation.equalsIgnoreCase("Clerk")) {
            emp.setInsuranceScheme("Scheme C");
        } else {
            emp.setInsuranceScheme("No Scheme");
        }
    }

    public void displayEmployee(Employee emp) {
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getDesignation());
        System.out.println(emp.getInsuranceScheme());
    }
}

public class EmployeeApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        emp.setId(sc.nextInt());
        emp.setName(sc.next());
        emp.setSalary(sc.nextDouble());
        emp.setDesignation(sc.next());

        EmployeeService service = new EmployeeServiceImpl();

        service.findInsuranceScheme(emp);

        service.displayEmployee(emp);

        sc.close();
    }
}