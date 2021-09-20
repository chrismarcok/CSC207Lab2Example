package com.example.demo.entity;

public abstract class AbstractFood {

    private String name;

    public AbstractFood(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void displayName() {
        System.out.println(this.name);
    }
}
