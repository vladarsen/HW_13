package com.vladarsenjtev;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();


        linkedList.add("Vlad");
        linkedList.add("Anna");
        linkedList.add("Oksana");
        linkedList.add("Yulia");
        linkedList.add("Oleg");


        list.add("Kira");
        list.add("Valentina");
        list.add("Pavel");
        list.add("Tatyana");
        list.add("Slavik");

        System.out.println(join(linkedList, list));
    }

    public static LinkedList<String> join(LinkedList<String> list, LinkedList<String> list2) {
        list.addAll(list2);
        return list;
    }
}
