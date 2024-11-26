package org.example;

public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;

    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }
    public String toString() {
        return "Ride Name: " + this.name + " minimum Height: " + this.lowestHeight + " Visitors: " + this.visitors;
    }
    public boolean isPermited(Person person) {
        if(person.getHeight() >= this.lowestHeight) {
            this.visitors++;
            return  true;
        }
        return  false;
    }
}
