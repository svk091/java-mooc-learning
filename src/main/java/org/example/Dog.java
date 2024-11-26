package org.example;

public class Dog {
    private String name;
    private int age;
    public Dog(String name) {
        this.name = name;
        this.age = 0;
    }
    public void printDog() {
        System.out.println("Name: " + this.name + ", Age: " + age);
    }
}
