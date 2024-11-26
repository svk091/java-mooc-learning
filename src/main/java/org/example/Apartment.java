package org.example;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment apartment) {
        if(this.squares > apartment.squares) return true;
        return  false;
    }
    public int priceDifference(Apartment apartment) {
        int ourPrice = this.squares * this.pricePerSquare;
        int comparedPrice = apartment.squares * apartment.pricePerSquare;
        return Math.abs(ourPrice - comparedPrice);
    }
    public boolean moreExpensiveThan(Apartment apartment) {
        int ourPrice = this.squares * this.pricePerSquare;
        int comparedPrice = apartment.squares * apartment.pricePerSquare;
        if(ourPrice > comparedPrice) return true;
        return false;
    }
}
