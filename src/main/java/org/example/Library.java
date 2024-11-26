package org.example;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> directory;

    public Library(HashMap<String, Book> directory) {
        this.directory = new HashMap<>();
    }

    public void addBook(Book book) {
        String name = sanitizedString(book.getName());
        if(this.directory.containsKey(name)) {
            System.out.println("Book is already in Library");
        }else {
            this.directory.put(name, book);
        }
    }
    public static String sanitizedString(String string) {
        if(string ==null) return "";
        string = string.trim();
        return  string.toLowerCase();
    }
}
