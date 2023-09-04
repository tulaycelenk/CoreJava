package com.demo;

import java.util.Arrays;

public class ArrayBasics {

    public void Declaring() {
       // declaring and allocating memory to array
       char vowels[] =new char[5];
       vowels[0]='a';
       vowels[1]='e';
       vowels[2]='i';
       vowels[3]='o';
       vowels[4]='u';
       System.out.println("first way: " + Arrays.toString(vowels));

       char vowels1[] = {'a', 'e', 'i', 'o', 'u'};
       System.out.println("second way: " + Arrays.toString(vowels1));

    }

    public void ArrayFunctions(){

        char vowels[] = {'u', 'e', 'x', 'o', 'a'};
        System.out.println("x is a false character in vowels array: " + Arrays.toString(vowels));

        vowels[2]='i';
        System.out.println("x replaced with i: " + Arrays.toString(vowels));

        int length = vowels.length;
        System.out.println("array length is " + length);

        //sort method can has many arguments
        Arrays.sort(vowels);
        System.out.println("sorted array: "+ Arrays.toString(vowels));

        //find o
        char key = 'o';
        int fountItemIndex= Arrays.binarySearch(vowels, key);
        System.out.println("o is there: "+ fountItemIndex);

        int startingIndex= 1;
        int endingIndex= 1;
        //fill with x letter
        Arrays.fill(vowels, startingIndex,endingIndex, 'x');
        System.out.println(vowels);


        int numbers[]= {1,2,3,4,5};
        //if we assign numbers directly to the copyOfNumbers, it will point same array
        int copyOfNumbers[] = numbers;

        //I just wanna change copyOfNumbers but numbers will change too
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));

        Arrays.fill(numbers,0);

        //how you copy an array:
        int copyToDifferentAddressInMemory[]= Arrays.copyOf(numbers,numbers.length);
        //another method is copyOfRange, starting and ending indexes should be given
        System.out.println(Arrays.toString(copyToDifferentAddressInMemory));
        System.out.println(Arrays.toString(numbers));

        //dont use "==", it checks for memory address, use equals method
        System.out.println(Arrays.equals(numbers,copyToDifferentAddressInMemory));

    }


}

