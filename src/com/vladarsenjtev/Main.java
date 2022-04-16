package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.addOrder("Vlad");
        coffeeOrderBoard.addOrder("Anna");
        coffeeOrderBoard.addOrder("Olga");
        coffeeOrderBoard.addOrder("Dmitry");
        coffeeOrderBoard.addOrder("Marina");
        coffeeOrderBoard.addOrder("Andrey");
        coffeeOrderBoard.addOrder("Kira");


        System.out.println(coffeeOrderBoard.getOrder());
        System.out.println();
        System.out.println(coffeeOrderBoard.deliver());
        System.out.println(coffeeOrderBoard.getOrder());
        System.out.println();
        System.out.println(coffeeOrderBoard.deliver(1));
        System.out.println(coffeeOrderBoard.getOrder());
        System.out.println();
        coffeeOrderBoard.draw();
    }
}
