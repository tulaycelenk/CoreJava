package com.demo;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println("----------Calculations----------");
        helloWorld.Calculations();
        System.out.println("----------Equations----------");
        helloWorld.Equations();
        System.out.println("----------Increase and Decrease----------");
        helloWorld.IncreaseDecrease();
        System.out.println("----------String Examples----------");
        helloWorld.StringExamples();

        ArrayBasics arrayBasics = new ArrayBasics();
        System.out.println("----------Declaring an Array----------");
        arrayBasics.Declaring();
        System.out.println("----------Some Array Functions----------");
        arrayBasics.ArrayFunctions();

        ForLoops forLoops = new ForLoops();
        System.out.println("----------Creating a For Loop----------");
        forLoops.CreatingForLoop();
        System.out.println("----------For Loop Examples----------");
        forLoops.Examples();

        WhileAndDoWhile whileAndDoWhile= new WhileAndDoWhile();
        System.out.println("----------Creating a While Loop----------");
        whileAndDoWhile.DoWhileLoop();
        System.out.println("----------Creating a Do While Loop----------");
        whileAndDoWhile.WhileLoop();

//        ArrayLists arrayLists= new ArrayLists();
//        System.out.println("----------Some Operations With an Array List----------");
//        arrayLists.ArrayListOperations();

        HashMaps hashMaps=new HashMaps();
        System.out.println("----------Some Operations With a HashMap----------");
        hashMaps.HashMapOperations();
    }
}
