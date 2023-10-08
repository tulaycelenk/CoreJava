package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSets {

    //HashSets cannot contain duplicate values
    //Allows null value
    //HashSet id an unordered collection,it doesn't maintain the order in which the elements are inserted
    //Internally uses a HAshMap to store elements.
    //not thread-safe.
    public void HashSetOperations(){

        Set<String> set = new HashSet<>();
        set.add("element1");
        set.add("element1");
        //Hashsets cannot contain  duplicate elements
        System.out.println("Two element1 added but it displays only one: "+set.toString());

        set.add("element2");
        set.add("element2");
        set.add("element2");
        set.add("element2");
        //unordered collection
        System.out.println("unordered "+set.toString());

        //null value
        set.add(null);
        set.add(null);
        System.out.println("Set can only have one null value: "+ set.toString());

        







    }
}
