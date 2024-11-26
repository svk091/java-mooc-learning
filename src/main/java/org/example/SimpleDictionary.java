package org.example;

import java.util.ArrayList;

public class SimpleDictionary {
    private ArrayList<DictionaryItem> items;

    public SimpleDictionary() {
        this.items = new ArrayList<>();
    }
    public void addItem(String word, String translation) {
        this.items.add(new DictionaryItem(word, translation));
    }
    public void printItems() {
        for(DictionaryItem item:items) {
            System.out.println(item);
        }
    }
    public String translate(String word) {
        for(DictionaryItem item: items) {
            if(item.getWord().equals(word)) {
                return item.getTranslation();
            }
        }
        return null;
    }
}
