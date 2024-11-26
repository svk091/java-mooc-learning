package org.example;

import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    private int weight;
    private int count;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
        this.weight = 0;
        this.count = 0;
    }
    public void addItem(Item item) {
        if(item.getWeight() + this.weight > maximumWeight) return;
        this.items.add(item);
        this.count++;
        this.weight += item.getWeight();
    }
    public String toString() {
        if(this.items.isEmpty()) return  "no items (0 kg)";
        if(this.items.size() == 1) return this.count + " item" + "(" +this.weight+" kg)";
        return this.count + " items" + "(" +this.weight+" kg)";
    }
    public void printItems() {
        for (Item item: items) {
            System.out.println(item);
        }
    }
    public int totalWeight() {
        return this.weight;
    }
    public Item heaviestItem() {
        if(this.items.isEmpty()) return null;
        Item returnedOject = this.items.get(0);
        for (Item item:items) {
            if(item.getWeight() > returnedOject.getWeight()) {
                returnedOject = item;
            }
        }
        return returnedOject;
    }
}
