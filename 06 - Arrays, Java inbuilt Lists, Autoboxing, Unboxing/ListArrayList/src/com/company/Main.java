package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
//    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice");
            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

//        System.out.println("Enter 10 integers");
//        getInput();
//        printArray(baseData);
//        resizeArray();
//        System.out.println("Enter 12 integers");
//        getInput();
//        printArray(baseData);
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To  print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item");
        groceryList.addGroceryItem(s.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number");
        int itemNumber = s.nextInt();
        s.nextLine();
        System.out.print("Enter replacement item");
        String newItem = s.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    public static void removeItem() {

    }

    public static void searchForItem() {

    }

//    private static void getInput() {
//        for (int i = 0; i < baseData.length; i++) {
//            baseData[i] = s.nextInt();
//        }
//    }

//    public static void printArray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }

//    public static void resizeArray() {
//        int[] original = baseData;
//        baseData = new int[12];
//
//        for (int i = 0; i < original.length; i++) {
//            baseData[i] = original[i];
//        }
//    }
 }
