package com.company;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }
}
