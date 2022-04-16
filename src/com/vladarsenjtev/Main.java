package com.vladarsenjtev;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Vlad");
        linkedList.add("Anna");
        linkedList.add("Oksana");

        System.out.println(addFirst(linkedList, "Yulia"));
    }

    public static LinkedList<String> addFirst(LinkedList<String> list, String str) {
        list.add(str);
        return list;
    }
}
