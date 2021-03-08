package com.company;

public class Dog extends Animal {
    // Adding this comment so I can make a commit on my study day
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is breathing");
    }
}
