package com.vladarsenjtev;

public class Order {
    private final String name;
    private final int number;

    public Order(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
