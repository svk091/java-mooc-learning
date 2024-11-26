package org.example;

public class PaymentTerminal {
    private double money;
    private int affordableMeals;
    private int heartyMeals;
    private final double AFFORDABLE_MEAL_COST = 2.50;
    private final double HEARTY_MEAL_COST = 4.30;
    public PaymentTerminal() {
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }
    public double eatAffordably(double payment) {
        if(payment < AFFORDABLE_MEAL_COST) return  payment;
        this.money += AFFORDABLE_MEAL_COST;
        this.affordableMeals++;
        return payment - AFFORDABLE_MEAL_COST;
    }
    public boolean eatAffordably(PaymentCard paymentCard) {
        boolean result =  paymentCard.takeMoney(AFFORDABLE_MEAL_COST);
        if(result) {
            this.affordableMeals++;
            this.money += AFFORDABLE_MEAL_COST;
        }

        return  result;
    }
    public boolean eatHeartily(PaymentCard paymentCard) {
        boolean result = paymentCard.takeMoney(HEARTY_MEAL_COST);
        if(result) {
            this.heartyMeals++;
            this.money += HEARTY_MEAL_COST;
        }
        return result;
    }
    public double eatHeartily(double payment) {
        if(payment < HEARTY_MEAL_COST) return  payment;
        this.money += HEARTY_MEAL_COST;
        this.heartyMeals++;
        return payment - HEARTY_MEAL_COST;
    }
    public void addMoneyToCard(PaymentCard paymentCard, double amt) {
        if(this.money < amt) return;
        paymentCard.addMoney(amt);
    }
    public String toString() {
       return   "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }

}
