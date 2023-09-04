package com.demo;

public class HelloWorld {
    public void Calculations() {
        int number1 = 12;
        int number2 = 6;
        // addition
        System.out.println(number1 + number2); // 18
        // subtraction
        System.out.println(number1 - number2); // 6
        // multiplication
        System.out.println(number1 * number2); // 72
        // division
        //if we divide double or float varible by an integer, the result will always be double.
        System.out.println(number1 / number2); // 2
        // remainder (modulo/modulus) bit-wise 1100 & 0110 → 0100
        System.out.println(number1 & number2); // 4
    }

    public void Equations() {
        int number1 = 12;
        int number2 = 15;
        // is equal to
        System.out.println(number1 == number2);//false
        // is not equal to
        System.out.println(number1 != number2);//true
        // is greater than
        System.out.println(number1 > number2);//false
        // is less than
        System.out.println(number1 < number2);//true
        // is greater than or equal to
        System.out.println(number1 >= number2);//false
        // is less than or equal to
        System.out.println(number1 <= number2);//true

    }
    public void IncreaseDecrease() {
        int number=55;

        //first writes to console,after increases by one
        System.out.println(number++);//55
        System.out.println(number);//56

        //first increases,after writes to console
        System.out.println(++number);//57

        //same with -- operator
        System.out.println(number--);//57
        System.out.println(number);//56

        //first increases,after writes to console
        System.out.println(--number);//55
    }

    public void StringExamples(){
        String name ="Tulay Celenk";
        String country = "Turkey";
        int age = 22;
        double gpa = 3.0;
        char percentSign = '%';

        String formattedString = String. format("My name is %s. I am from %s. I am %d years old. My GPA is %f. I have attended 100%c of my university classes.", name, country, age, gpa,percentSign);
        System.out.println(formattedString);

        //some string methods
        System.out.println("String methods ");
        System.out.println("Uppercase name : "+name.toUpperCase());
        System.out.println("Lowercase name : "+name.toLowerCase());
        System.out.println("Replace 'Tulay' with 'Tülay': "+name.replace("Tulay","Tülay"));
        System.out.println("Is name contains 'ay' : "+name.contains("ay"));

        String abc1="abc";
        String abc2="ABC";
        System.out.println("abc==ABC : "+abc1.equals(abc2));//false
        System.out.println("abc==ABC (ignore cases) : " +abc2.equalsIgnoreCase(abc2));//true

        //string pool
        String str1= "xyz";
        String str2= "xyz";
        System.out.println("str1==str2 : " + (str1==str2));

        //creates new allocation
        String object1 = new String("xyz");
        System.out.println("str1==object1 : " + (str1==object1));

    }
}