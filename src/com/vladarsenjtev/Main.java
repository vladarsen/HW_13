package com.vladarsenjtev;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.add("Vlad");
        linkedList.add("Anna");
        linkedList.add("Oksana");
        linkedList.add("Yulia");
        linkedList.add("Oleg");
        linkedList.add("Kira");
        linkedList.add("Valentina");
        linkedList.add("Pavel");
        linkedList.add("Tatyana");
        linkedList.add("Slavik");

        System.out.println(linkedList);
        System.out.println();
        System.out.println(shuffle(linkedList));

    }

    public static LinkedList<String> shuffle(LinkedList<String> list) {
        Collections.shuffle(list);
        return list;
    }
}