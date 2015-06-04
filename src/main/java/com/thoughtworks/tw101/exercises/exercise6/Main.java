package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// String name(), and int currentHitpoints() methods. Store instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the name and current hit points of all monsters.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

interface Monster {
    void takeDamage(int amount);
    String name();
    int currentHitpoints();
}

class Troll implements Monster {

    String name;
    int hitPoints;

    public Troll(){
        name = "Troll";
        hitPoints = 40;
    }
    public void takeDamage(int amount) {
        hitPoints-= amount/2;
    }

    public String name() {
        return name;
    }

    public int currentHitpoints() {
        return hitPoints;
    }
}

class Orc implements Monster {

    String name;
    int hitPoints;

    public Orc(){
        name = "Orc";
        hitPoints = 20;
    }

    public void takeDamage(int amount) {
        hitPoints-= amount;
    }

    public String name() {
        return name;
    }

    public int currentHitpoints() {
        return hitPoints;
    }
}


public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> monsters = new ArrayList();

        Troll troll = new Troll();
        Orc orc = new Orc();

        monsters.add(troll);
        monsters.add(orc);

        for(Monster monster : monsters) {
            monster.takeDamage(10);
            System.out.print(monster.name() + " " + monster.currentHitpoints() + "\n");
        }

    }
}
