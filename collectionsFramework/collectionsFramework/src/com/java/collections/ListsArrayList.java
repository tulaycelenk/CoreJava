package com.java.collections;

import java.util.*;

public class ListsArrayList {
    public void Lists(){

        //EXAMPLE 1
        //creating an arraylist and adding some elements
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


        //EXAMPLE 2
        List<Integer> firstFivePrimeNumbers= new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        //sending different list as a parameter
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers=new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        //adding list to another list
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println("two lists merged: "+ firstTenPrimeNumbers);


        //EXAMPLE 3
        List<String> topProgrammingLanguages= new ArrayList<>();

        //check if an array list is empty
        System.out.println("Is the top programming languages list empty: " + topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("Java"); //0
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add(".Net");
        topProgrammingLanguages.add("C");//4

        //Find the size of an ArrayList
        System.out.println("Here are the top " + topProgrammingLanguages.size() + "programming languages in the world");

        //Retrieve the element at a given index
        String bestProgrammingLang = topProgrammingLanguages.get(1);
        System.out.println("best programming lang => " + bestProgrammingLang);

        //Modify the element
        topProgrammingLanguages.set(3,"C#");
        System.out.println("quick fix .Net to C#: " + topProgrammingLanguages );

    }

    public void differentWaysToIterateOverList(){

        System.out.println();
        System.out.println("Iterating Over List;");
        List<String> courses = Arrays.asList("C","C++","Java","Spring","Hibernate");

        //basic for loop
        System.out.println();
        System.out.println("For loop;");
        for (int i = 0; i< courses.size();i++){
            System.out.println(courses.get(i));
        }

        //Enhanced for each
        System.out.println();
        System.out.println("Enhanced Foreach; ");
        for (String course : courses){
            System.out.println(course);
        }

        //basic loop with iterator
        System.out.println();
        System.out.println("For loop with Iterator;");
        for (Iterator iterator = courses.iterator(); iterator.hasNext();){
            String course = (String) iterator.next();
            System.out.println(course);
        }

        //iterator with while loop
        System.out.println();
        System.out.println("While loop with Iterator; ");
        Iterator it = courses.iterator();
        while (it.hasNext()){
            String course = (String) it.next();
            System.out.println(course);
        }

        //Java 8 stream + lambda example
        courses.stream().forEach(course -> System.out.println(course));

        //Java 8 foreach + lambda example
        courses.forEach((course)-> System.out.println(course));

        //getting list iterator
        ListIterator<String> listIterator = courses.listIterator();

        System.out.println("Forward direction iterator: ");
        //hasNext, next()
        while (listIterator.hasNext()){
            String element = listIterator.next();
            System.out.println(element);
        }

        System.out.println("Backward direction iterator: ");
        //previous(), previousNext()
        while (listIterator.hasPrevious()){
            String element = listIterator.previous();
            System.out.println(element);
        }
    }
}
