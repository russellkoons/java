package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Atlanta");
        placesToVisit.add("New York City");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Tokyo");
        placesToVisit.add("Pittsburgh");

        printList(placesToVisit);

        placesToVisit.add(1, "Charlotte");

        printList(placesToVisit);

        placesToVisit.remove(4);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("====================================");
    }
}
