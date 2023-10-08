package com.java.collections;

import javafx.beans.binding.When;

import javax.swing.*;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {

    //Linked lists can contain duplicate elements
    //maintains insertion order
    //implements queue dequeue interfaces, therefore, it can also be as a queue dequeue or stack
    //not thread safe, must explicitly synchronize concurrent modifications to the linkedList in a multithreaded environment
    //implements List interface as arraylist
    //internally use doubly linked list
    //consumes more memory than arraylist but linked list faster on operations

    LinkedList<String> fruits = new LinkedList<>();

    public void linkedListOperations() {
        fruits.add("Grape");
        fruits.add("Apple");
        fruits.add("Mango");
        System.out.println("initial linkedList -> " + fruits);

        //adding an element at the specified position in the linkedlist
        fruits.add(2, "Watermelon");
        System.out.println("after adding watermelon at index 2 -> " + fruits);

        //adding an element at the beginning of the linkedList ( addFirst comes from dequeue interface )
        fruits.addFirst("Strawberry");
        System.out.println("after adding strawberry as a first element -> " + fruits);

        //adding an element at the end of the linkedList
        fruits.addLast("Strawberry");
        System.out.println("after adding strawberry as a last element-> " + fruits);
    }

    public void RetrieveElements() {
        System.out.println();
        System.out.println("Retrieving elements;");
        //getting the first element in the LinkedList using getFirst()
        System.out.println("first element -> " + fruits.getFirst());

        //getting last element using getLast()
        System.out.println("last element -> " + fruits.getLast());

        //getting the element at a given position in the fruits list
        System.out.println("element at 1 -> " + fruits.get(1));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

    }

    public void RemoveElements() {

        //remove the first element in the LinkedList
        System.out.println("after removing first element -> " + fruits.removeFirst() +fruits);

        //remove last element
        System.out.println("after removing last element -> " + fruits.removeLast()+fruits);

        fruits.remove("mango" );
        System.out.println("after removing mango -> "+fruits);

        fruits.clear();
        System.out.println("list cleared: "+fruits);
    }

    public void IteratingAndSearchingWays(){

        LinkedList<String> menuList= new LinkedList<>();
        menuList.add("Soup");
        menuList.add("Beef");
        menuList.add("Salad");
        menuList.add("Salad");
        menuList.add("Pasta");
        menuList.add("Cake");

        boolean result = menuList.contains("Soup");
        System.out.println("menuList contains soup or not result -> "+result);

        // find the index of the first occurrence
        int index = menuList.indexOf("Salad");
        System.out.println("index of salad -> " + index);

        // find the index of the last occurrence
        int lastIndex = menuList.lastIndexOf("Salad");

        //Iterator
        System.out.println("menu list by using iterator");
        Iterator<String> iterator = menuList.iterator();
        while (iterator.hasNext()){
            String menu = (String) iterator.next();
            System.out.println(menu);
        }
        // forEach
        System.out.println("menu list by using foreach");
        menuList.forEach((element) -> {
            System.out.println(element);
        });
    }
}
