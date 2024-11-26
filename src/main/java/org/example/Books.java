package org.example;

public class Books {
    private String name;
    private int publicationYear;
    private int count;

    public Books(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.count = 0;
    }

    public boolean equals(Object compared) {
        if (this == compared) return true;
        if (!(compared instanceof Books)) return false;
        Books comparedBooks = (Books) compared;
        return this.name.equals(comparedBooks.name) && this.publicationYear == comparedBooks.publicationYear;
    }
}
