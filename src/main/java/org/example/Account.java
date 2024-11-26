package org.example;

class Account {
    private String name;
    private double balance;
    Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    double balance() {
        return  this.balance;
    }

    void  withdraw(double amount) {
        this.balance -= amount;
    }

    void  deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public  String toString() {
        return  this.name + ": " + this.balance;
    }
}
