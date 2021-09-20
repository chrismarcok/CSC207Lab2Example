package com.example.demo.entity;

public class Soup extends AbstractFood implements Drinkable {
    private int temperature;

    public Soup(int temperature, String name) {
        super(name);
        this.temperature = temperature;
    }

    @Override
    public void displayName() {
        if (this.temperature > 100) {
            System.out.println("[HOT] " + this.getName());
        } else {
            System.out.println("[COLD] " + this.getName());
        }
    }

    @Override
    public void drink() {
        System.out.println("Drinking the " + this.getName());
    }
}