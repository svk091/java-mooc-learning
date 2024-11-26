package org.example;

public class HealthStation {
    public int weigh(Person person) {
        return person.getWeight();
    }
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
}
