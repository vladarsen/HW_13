package com.vladarsenjtev;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CoffeeOrderBoard {
    private final LinkedList<Order> orderList = new LinkedList<>();

    public void addOrder(String name) {
        int number = addNumber();
        orderList.addLast(new Order(name, number));
    }

    public LinkedList<Order> getOrder() {
        return orderList;
    }

    public Order deliver() {
        return orderList.pollLast();
    }

    public Order deliver(int number) {
        Order ord = orderList.get(number - 1);
        orderList.remove(number - 1);
        return ord;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num   |  Name");
        for (Order order : orderList) {
            System.out.println(order.getNumber() + "     |  " + order.getName());
        }
    }

    public int addNumber() {
        int num;
        try {
            Order ord = orderList.getLast();
        } catch (NoSuchElementException ex) {
            return 1;
        }
        Order ord = orderList.getLast();
        num = ord.getNumber();
        return num + 1;
    }
}
