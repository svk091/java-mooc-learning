package org.example;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) zero = "0";
        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros > compared.euros) {
            return false;
        } else {
            if (this.cents < compared.cents) {
                return true;
            } else {
                return false;
            }
        }
    }

    public Money minus(Money decreaser) {
        double ourMoney = this.euros + (this.cents /  100.0);
        double decreaserMoney = decreaser.euros + (decreaser.cents / 100.0);

        double result = ourMoney - decreaserMoney;
        if (result <= 0) return new Money(0, 0);
        int euros = (int) result;
        int cents = (int) Math.round((result - euros) * 100);
        return new Money(euros, cents);
    }
}
