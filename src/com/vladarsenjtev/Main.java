package com.vladarsenjtev;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>();


        linkedList.add("Vlad");
        linkedList.add("Anna");
        linkedList.add("Oksana");
        linkedList.add("Yulia");
        linkedList.add("Kira");
        list.add("Vlad");
        list.add("Anna");
        list.add("Tatyana");
        list.add("Slavik");
        list.add("Olga");

        System.out.println(linkedList);
        System.out.println(list);
        System.out.println();
        System.out.println(intersect(linkedList, list));
    }

    public static LinkedList<String> intersect(LinkedList<String> list,LinkedList<String> list2) {
        LinkedList<String> linkedList = new LinkedList<>();

        for (String str : list) {
            for (String value : list2) {
                if (str.equals(value)) {
                    linkedList.add(str);
            }
            }
        }
        return linkedList;
    }
}