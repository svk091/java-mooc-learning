package org.example;

import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;
    private int weight;

    public Package() {
        this.gifts = new ArrayList<>();
        this.weight = 0;
    }
    public void addGift(Gift gift) {
        this.gifts.add(gift);
        this.weight += gift.getWeight();
    }
    public int totalWeight() {
        return this.weight;
    }
}
