package com.company;

public class Main {

    public static void main(String[] args) {
        int fizzAt = 3;
        int buzzAt = 5;


        for (int i=1; i<20 ;i++) {
            if (i%fizzAt==0){
                System.out.print("Fizz ");
            }
            if (i%buzzAt==0){
                System.out.print("Buzz");
            }
            else if (i%fizzAt!=0 && i%buzzAt!=0){
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
