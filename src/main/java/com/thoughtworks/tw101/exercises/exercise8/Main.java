package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> userGuesses = new ArrayList<>();

        //get random number
        RandomNumGenerator ranNum = new RandomNumGenerator(100);
        int randomNumber = ranNum.getRanNum();

        //get user input
        User user = new User();
        int input = user.getUserInput();
        userGuesses.add(input);

        //check if input is guess
        while(randomNumber != input) {
            if(randomNumber < input) {
                System.out.print("you are high\n");
            } else {
                System.out.print("You are too low\n");
            }

            input = user.getUserInput();
            userGuesses.add(input);
        }
        System.out.print("Congrats! You got it!\nYou guessed:\n");
        for(int item : userGuesses) {
            System.out.print(item + ",");
        }
    }

}

class User {

    public User() {
    }

    public int getUserInput() {

        Scanner reader;
        int guess;

        while(true) {
            try {
                System.out.print("What do you want to guess? \n");
                reader = new Scanner(System.in);
                guess = reader.nextInt();
                break;
            }
            catch(InputMismatchException | NumberFormatException ex ) {
                System.out.print("Please input a number. Try Again\n");
            }
        }
        return guess;
    }
}

class RandomNumGenerator {

    private Random randomGenerator;
    private int max;

    public RandomNumGenerator(int max) {
        randomGenerator = new Random();
        this.max = max;
    }

    public int getRanNum() {
        return randomGenerator.nextInt(max);
    }
}
