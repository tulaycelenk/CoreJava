package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {
    public void Examples(){
        Collection<String> fruitCollection = new ArrayList<>();

        fruitCollection.add("banana");
        fruitCollection.add("apple");
        fruitCollection.add("mango");
        System.out.println(fruitCollection);

        fruitCollection.remove("banana");
        System.out.println(fruitCollection);

        System.out.println("Contains apple : "+ fruitCollection.contains("apple"));

        fruitCollection.forEach((element)->{
            System.out.println(element);
        });
        fruitCollection.clear();
        System.out.println(fruitCollection);

        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();

    }
}
