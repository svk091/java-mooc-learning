package org.example;

public class PaymentCard {
    private double balance;
//    private final double AFFORDABLE_MEAL_COST = 2.60;
//    private final double HEARTY_MEAL_COST = 4.60;
    private final double MAX_BALANCE = 150.0;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has balance of " + this.balance + " euros";
    }

//    public void eatAffordably() {
//        if (this.balance >= AFFORDABLE_MEAL_COST) this.balance -= 2.60;
//    }
//
//    public void eatHeartily() {
//        if (this.balance >= HEARTY_MEAL_COST) this.balance -= 4.60;
//    }

    public void addMoney(double amt) {
        if (amt <= 0) return;
        this.balance = Math.min(this.balance + amt, MAX_BALANCE);
    }
    public boolean takeMoney(double amt) {
        if(this.balance - amt < 0) return  false;
        this.balance -= amt;
        return  true;
    }
    public double balance() {
        return this.balance;
    }
}
