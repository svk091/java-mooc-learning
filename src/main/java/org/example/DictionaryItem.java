package org.example;

public class DictionaryItem {
    private String word;
    private String translation;

    public DictionaryItem(String word, String translation) {
        this.translation = translation;
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setWord(String word) {
        this.word = word;
    }
    public String toString() {
        return this.word + ": " + this.translation;
    }
}
