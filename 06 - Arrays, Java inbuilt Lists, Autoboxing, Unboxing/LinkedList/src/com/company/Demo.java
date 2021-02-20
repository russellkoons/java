package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

    private static boolean addInOrder(LinkedList<String> list, String newCity) {
        ListIterator<String> stringListIterator = list.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already in the list");
                return false;
            } else if (comparison > 0) {
                // newCity should appear before this one
                // Brisbane -> Adelaide would return > 0
                stringListIterator.previous();
                stringListIterator.add(newCity);
            }
        }
    }
}
