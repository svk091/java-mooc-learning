package org.example;

public class Whistle {
    private String sound;
    public Whistle(String sound) {
        this.sound = sound;
    }
    public void sound() {
        System.out.println("Sound: " + this.sound);
    }
}
