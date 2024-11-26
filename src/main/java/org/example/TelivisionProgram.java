package org.example;

public class TelivisionProgram {
    private String name;
    private int duration;

    public TelivisionProgram(String name,  int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String  toString() {
        return this.name + ", " + this.duration + " minutes";
    }

    public int getDuration() {
        return this.duration;
    }
}
