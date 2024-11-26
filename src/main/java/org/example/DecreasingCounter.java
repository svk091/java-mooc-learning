package org.example;

public class DecreasingCounter {
    private int count;

    public DecreasingCounter(int initialValue) {
        this.count = initialValue;
    }

    public void printValue() {
        System.out.println("Value: " + this.count);
    }

    public void decrement() {
        if (this.count > 0) this.count -= 1;
    }

    public void reset() {
        this.count = 0;
    }
}
