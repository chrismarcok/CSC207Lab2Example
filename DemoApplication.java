package com.example.demo;

import com.example.demo.entity.AbstractFood;
import com.example.demo.entity.Drinkable;
import com.example.demo.entity.Soup;
import com.example.demo.entity.Stew;

import java.util.ArrayList;
import java.util.List;


public class DemoApplication {

	public static void main(String[] args) {
        AbstractFood chickenNoodleSoup = new Soup(200, "Chicken Noodle Soup");
        AbstractFood beefStew = new Stew("Beef Stew");

        List<AbstractFood> menu = new ArrayList<>();
        menu.add(chickenNoodleSoup);
        menu.add(beefStew);

//        menu.forEach(AbstractFood::displayName);
		
        // same as the above line is equivalent to:
        for (int i = 0; i < menu.size(); i++){
            menu.get(i).displayName();
        }

        System.out.println("-------------------------");
// Interfaces can be used as types too just like abstract classes
//        List<Drinkable> drinkList = new ArrayList<>();
//        drinkList.add(new Soup(100, "Tomato Soup"));
//        drinkList.add(new Stew("Canadian Stew"));
//        drinkList.forEach(Drinkable::drink);
//        Drinkable drink = drinkList.get(0);
//        drink.interfaceMethod();
	}
}
