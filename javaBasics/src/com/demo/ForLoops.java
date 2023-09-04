package com.demo;

public class ForLoops {

    public void CreatingForLoop() {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        int numbers[] = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i);
        }
    }

    public void Examples(){

        int number=5;
        for (int mul=1;mul<10;mul++){
            System.out.printf("%d X %d = %d \n" , number,mul,number * mul);
        }
        System.out.println();
        //inside a for loop we have another loop
        for (int num = 1; num <10 ; num++){
            for (int mul = 1; mul<10; mul++){
                System.out.printf("%d X %d = %d \n", num,mul,num*mul);
            }
            System.out.println();
        }

        System.out.print("sum of numbers :");
        int numbers[] = {1, 2, 3, 4};
        int sum =0;
        for (int num : numbers){
            sum+= number;
        }
        System.out.println(sum);

    }
}
