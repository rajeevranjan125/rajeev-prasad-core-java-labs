package com.rajeev.lab7.exe1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.insuranceScheme = getScheme();
    }

    private String getScheme() {
        if (salary > 5000 && salary < 20000 &&
                designation.equalsIgnoreCase("System Associate")) {
            return "Scheme C";
        } else if (salary >= 20000 && salary < 40000 &&
                designation.equalsIgnoreCase("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 &&
                designation.equalsIgnoreCase("Manager")) {
            return "Scheme A";
        } else if (salary < 5000 &&
                designation.equalsIgnoreCase("Clerk")) {
            return "No Scheme";
        }
        return "No Scheme";
    }

    public int getId() {
        return id;
    }

    public String getInsuranceScheme() {
        return insuranceScheme;
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Name=" + name +
                ", Salary=" + salary +
                ", Designation=" + designation +
                ", InsuranceScheme=" + insuranceScheme;
    }
}

interface EmployeeService {
    void addEmployee(Employee emp);
    void displayByScheme(String scheme);
    void deleteEmployee(int id);
}

class EmployeeServiceImpl implements EmployeeService {

    private HashMap<Integer, Employee> employees = new HashMap<>();

    @Override
    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }

    @Override
    public void displayByScheme(String scheme) {
        boolean found = false;

        for (Map.Entry<Integer, Employee> entry : employees.entrySet()) {
            Employee emp = entry.getValue();

            if (emp.getInsuranceScheme().equalsIgnoreCase(scheme)) {
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employee found.");
        }
    }

    @Override
    public void deleteEmployee(int id) {
        if (employees.remove(id) != null) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}

public class EmployeeInsuranceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeServiceImpl();

        service.addEmployee(new Employee(101, "Rajeev", 15000, "System Associate"));
        service.addEmployee(new Employee(102, "Amit", 25000, "Programmer"));
        service.addEmployee(new Employee(103, "Neha", 50000, "Manager"));
        service.addEmployee(new Employee(104, "Karan", 4000, "Clerk"));

        System.out.print("Enter Insurance Scheme: ");
        String scheme = sc.nextLine();

        service.displayByScheme(scheme);

        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();

        service.deleteEmployee(id);

        sc.close();
    }
}