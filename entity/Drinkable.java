package com.example.demo.entity;

public interface Drinkable {
    public final int a = 1; // any variable defined in an interface is really a constant (final).

    public void drink();

    public default void interfaceMethod(){
        System.out.println(a);
    }
}
