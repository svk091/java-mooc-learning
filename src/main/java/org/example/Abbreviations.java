package org.example;

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbrevations;
    public Abbreviations() {
        this.abbrevations = new HashMap<>();
    }
    public void addAbbreviation(String abbrevation, String explanation) {
        this.abbrevations.put(abbrevation, explanation);
    }
    public boolean hasAbbreviation(String abbrevation) {
        return this.abbrevations.containsKey(abbrevation);
    }
    public String findExplanationFor(String abbrevation) {
        if(this.abbrevations.containsKey(abbrevation)) {
            return this.abbrevations.get(abbrevation);
        }
        return null;
    }
}
