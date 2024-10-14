package org.example;

interface Product {
    double getPrice();
    String getName();
}


abstract class PhysicalProduct implements Product {
    abstract double getWeight();
}


class Book extends PhysicalProduct {
    private String name;
    private double price;
    private double weight;

    public Book(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    double getWeight() {
        return weight;
    }
}

class Software implements Product {
    private String name;
    private double price;

    public Software(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
