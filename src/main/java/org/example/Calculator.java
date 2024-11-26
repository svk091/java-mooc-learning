package org.example;

public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }
    public  void add(int number) {
        this.value += number;
    }
    public void subract(int number) {
        this.value -= number;
    }

    public int getValue() {
        return value;
    }
}
