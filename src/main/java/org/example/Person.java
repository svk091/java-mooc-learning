package org.example;

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;
    private Pet pet;

    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int height) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = height;
    }
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }


    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return this.age;
    }

    public void growOlder() {
        this.age = this.age + 1;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public int getWeight() {
        return this.weight;
    }

    public double bodyMassIndex() {
        double heightDivByHundred = this.height / 100.0;
        return this.weight / (heightDivByHundred * heightDivByHundred);
    }

    @Override
    public String toString() {
        return this.name + "(" + this.height + " cm)";
    }
}
