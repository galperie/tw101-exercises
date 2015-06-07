package com.thoughtworks.tw101.exercises.exercise7;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get random number
        RandomNumGenerator ranNum = new RandomNumGenerator(100);
        int randomNumber = ranNum.getRanNum();

        //get user input
        User user = new User();
        int input = user.getUserInput();

        //check if input is guess
        while(randomNumber != input) {
            if(randomNumber < input) {
                System.out.print("you are high\n");
            } else {
                System.out.print("You are too low\n");
            }

            input = user.getUserInput();
        }
        System.out.print("Congrats! You got it!");
    }
}

class User {

    public User() {
    }

    public int getUserInput() {
        System.out.print("What do you want to guess? \n");

        Scanner reader = new Scanner(System.in);

        return reader.nextInt();
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
