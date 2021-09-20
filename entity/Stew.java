package com.example.demo.entity;

public class Stew extends AbstractFood implements Edible, Drinkable {

    public Stew(String name) {
        super(name);
    }

    @Override
    public void drink() {
        System.out.println("Slurping the " + this.getName());
    }

    @Override
    public void eat() {
        System.out.println("Having a big bite of the " + this.getName());
    }
}
