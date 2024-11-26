package org.example;

import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    private int count;
    private int weight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
        this.count = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.weight > maximumWeight) return;
        this.suitcases.add(suitcase);
        this.count++;
        this.weight += suitcase.totalWeight();

    }

    public String toString() {
        if (this.suitcases.isEmpty()) return "0 suitcases (0 kg)";
        if (this.suitcases.size() == 1) return this.count + "suitcase" + "(" + this.weight + " kg)";
        return this.count + "suitcases" + "(" + this.weight + " kgs)";
    }
    public void printItems() {
        for(Suitcase suitcase: suitcases) {
            System.out.println(suitcase);
        }
    }
}
