package com.org.task6;

public class Item {
    private String name;
    private double weight;
    private double price;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getWeigth() {
        return weight;
    }

    void setWeigth(double weight) {
        this.weight = weight;
    }

    double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Item(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }


}