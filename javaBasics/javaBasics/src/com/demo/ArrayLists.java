package com.demo;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    ArrayList<Integer> numbers= new ArrayList<Integer>();

    public void CreatingArrayList(){
        numbers.add(2);
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
    }

    public void ArrayListOperations(){

        CreatingArrayList();

        //print array list
        System.out.println(numbers.toString());
        //print single specific value
        System.out.println(numbers.get(1));
        //remove by index number
        numbers.remove(2);
        System.out.println(numbers.toString());

        //remove by value
        numbers.remove(Integer.valueOf(4));
        System.out.println("4 is removed "+numbers.toString());

        //set(index, new value)
        numbers.set(2,Integer.valueOf(32));
        System.out.println("set element in index 2 to 32 "+ numbers.toString());

        //natural and reverse order
        numbers.sort(Comparator.naturalOrder());
        System.out.println("natural order: "+numbers.toString());

        numbers.sort(Comparator.reverseOrder());
        System.out.println("reverse order: " +numbers.toString());

        //array list contains 10 or not
        System.out.println("is there any 10?: "+numbers.contains(Integer.valueOf(10)));

        System.out.println("is that array list empty(true) or not(false): "+numbers.isEmpty());

        //each element will be multiplied by 2
        numbers.forEach(number ->{
            numbers.set(numbers.indexOf(number),number*2);
            //System.out.print(", "+number * 2);
        });
        System.out.println(numbers.toString());

        //delete all elements from the array list
        numbers.clear();
        System.out.println(numbers.toString());
    }

}
