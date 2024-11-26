package org.example;

public class Book {
    private String name;
    private String content;
    private int published;

    public Book(String name, String content, int published) {
        this.name = name;
        this.content = content;
        this.published = published;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + this.name + " Content: " + this.content + " Published: " + this.published;
    }
}
