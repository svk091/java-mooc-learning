package org.example;

public class Song {
    private String troup;
    private String name;
    private int length;

    public Song(String troup, String name, int length) {
        this.troup = troup;
        this.name = name;
        this.length = length;
    }

    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (!(compared instanceof Song)) return false;
        Song comparedSong = (Song) compared;
        if (this.troup.equals(comparedSong.troup) && this.name.equals(comparedSong.name) && this.length == ((Song) compared).length)
            return true;
        return false;
    }

    public String name() {
        return this.name;
    }

    public int length() {
        return this.length;
    }
}
