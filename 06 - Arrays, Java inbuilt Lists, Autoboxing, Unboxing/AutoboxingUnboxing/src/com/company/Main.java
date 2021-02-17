package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] array = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Russell");

//        ArrayList<int> intArrayList = new ArrayList<int>(); ArrayLists cannot be primitive types
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(69));

        Integer integer = Integer.valueOf(69);
        Double doubleValue = Double.valueOf(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // You can use this instead of adding new. This is the same as Integer.valueOf(56)
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl < 10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + "-> " + value);
        }
    }
}
