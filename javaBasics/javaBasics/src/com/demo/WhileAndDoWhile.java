package com.demo;

public class WhileAndDoWhile {

    public void WhileLoop(){
        int number =4;
        int multiplier = 2;
        while(multiplier<=10){
            System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
            multiplier++;
        }
    }
    public void DoWhileLoop(){
        int number = 3;
        int multiplier = 5;

        do {
            System.out.printf("%d X %d = %d \n", number, multiplier, number*multiplier);
            multiplier++;
        }
        while (multiplier<=10);

    }
}
