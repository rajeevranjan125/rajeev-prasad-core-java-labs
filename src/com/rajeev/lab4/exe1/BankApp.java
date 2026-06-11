package com.rajeev.lab4.exe1;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Account {
    private static int accCounter = 1000;

    protected int accNum;
    protected double balance;
    protected final double MIN_BALANCE = 500;

    public Account(double balance) {
        this.accNum = accCounter++;

        if (balance < MIN_BALANCE) {
            throw new IllegalArgumentException("Minimum opening balance must be INR 500");
        }

        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) return false;

        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void display() {
        System.out.println("Account No: " + accNum + ", Balance: INR " + balance);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double balance, double overdraftLimit) {
        super(balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) return false;

        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

public class BankApp {
    public static void main(String[] args) {

        SavingsAccount smithAcc = new SavingsAccount(2000);
        SavingsAccount kathyAcc = new SavingsAccount(3000);

        smithAcc.deposit(2000);

        kathyAcc.withdraw(2000);

        System.out.println("Updated Account Details:");
        smithAcc.display();
        kathyAcc.display();

        Account acc1 = new SavingsAccount(5000);
        Account acc2 = new CurrentAccount(3000, 2000);

        acc1.withdraw(1000);
        acc2.withdraw(4500);

        acc1.display();
        acc2.display();
    }
}