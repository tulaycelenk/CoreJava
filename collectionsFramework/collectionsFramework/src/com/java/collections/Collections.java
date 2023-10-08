package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {
    public void Examples(){
        Collection<String> fruitCollection = new ArrayList<>();

        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("mango");
        System.out.println("Fruit collection is created -> "+fruitCollection);

        fruitCollection.remove("banana");
        System.out.println("removed banana "+fruitCollection);

        System.out.println("fruitCollection contains apple or not: "+ fruitCollection.contains("apple"));

        System.out.println("Printing whole list with foreach and lambda expression; ");
        fruitCollection.forEach((element)->{
            System.out.println(element);
        });
        fruitCollection.clear();
        System.out.println("After clear function: "+fruitCollection);

    }
}
