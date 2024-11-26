package org.example;

public class Container {
    private int volume;
    private final int MAX_VOLUME = 100;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount < 0) return;
        if (this.volume + amount > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else {
            this.volume += amount;
        }
    }

    public void remove(int amount) {
        if (this.volume - amount < 0) {
            this.volume = 0;
        } else {
            this.volume -= amount;
        }
        String s = null;
    }

    public String toString() {
        return this.volume + "/" + MAX_VOLUME;
    }
}
