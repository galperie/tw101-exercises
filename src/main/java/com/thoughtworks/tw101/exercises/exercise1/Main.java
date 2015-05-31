package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {

    public static int SUM = 0;

    public static void main(String[] args) {
        Main main = new Main();

        for(int i = 1; i <= 100; i++ ) {
            if(main.isOdd(i) != 0) {
                main.sumOfNumbers(i);
                main.printNumber(i);
            }
        }
        main.printNumber(SUM);
    }

    private void printNumber(int x) {
        System.out.print(x);
        System.out.print("\n");
    }

    public int isOdd(int x) {
        return x % 2;
    }

    private void sumOfNumbers(int x) {
       SUM += x;
    }
}
