package org.example;

import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;
    public Stack() {
        this.stack = new ArrayList<>();
    }
    public boolean isEmpty() {
        if(this.stack.isEmpty()) return true;
        return false;
    }
    public void add(String value) {
        this.stack.add(value);
    }
     public ArrayList<String> values() {
        return stack;
    }
    public String take() {
        String str = this.stack.get(stack.size() - 1);
        this.stack.remove(this.stack.get(stack.size() - 1));
        return str;
    }
}
