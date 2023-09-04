package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public void Lists(){
        List<String> list= new ArrayList<>();
        //list allows to add duplicate elements
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");
        System.out.println(list);
        // null elements are excepted
        list.add(null);
        list.add(null);
        System.out.println(list);
        //accessing an element from list by using index
        System.out.println("element in index 0 is: " + list.get(0));


        List<Integer> firstFivePrimeNumbers= new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers=new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);
    }
}
