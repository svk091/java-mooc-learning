package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    public String drawJokes() {
        if (jokes.isEmpty()) {
            return  "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return  jokes.get(index);
        }
    }
    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }
}
