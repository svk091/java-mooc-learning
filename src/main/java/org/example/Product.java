package org.example;

public class Product {
    private String name;
    private Double price;
    private int quantity;
    public Product(String initialName, Double initialPrice, int initialQuantitiy) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantitiy;
    }
    public void printProduct() {
        System.out.println("Name: " + this.name + ", Price in rupees: " + this.price + ", Quantity: " + this
                .quantity);
    }
}
