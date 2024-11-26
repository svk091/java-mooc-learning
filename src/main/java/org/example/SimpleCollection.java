package org.example;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> collection;

    public SimpleCollection(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }
    public void add(String element) {
        this.collection.add(element);
    }
    public String toString() {
        if(collection.isEmpty()) return  "The collection" + this.name + " is empty";
        String elements = "";
        for(String element: collection) {
            elements += element + "\n";
        }
        return "The collection " + this.name + "has " +  this.collection.size() + " elements" + "\n" + elements;
    }
    public String longest() {
        if(this.collection.isEmpty()) return null;
        String returnedObject = this.collection.get(0);
        for(String element: collection) {
            if(element.length() > returnedObject.length()) {
                returnedObject = element;
            }
        }
        return returnedObject;
    }
}
