package com.company;

public class Animal {
    final String species;
    private Double weight;
    public String name;

    public static final Double DEFAULT_DOG_WEIGHT = 12.0;
    public static final Double DEFAULT_MOOSE_WEIGHT = 500.0;
    public static final Double DEFAULT_LION_WEIGHT = 180.0;


    public Animal(String species) {
        this.species = species;
        if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        } else if (species == "moose") {
            this.weight = DEFAULT_MOOSE_WEIGHT;
        } else if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
    }


    void feed() {
        if (weight > 0.0) {
            weight++;
            System.out.println("Thank you for the food,my weight is now " + weight + " kg");
        } else {
            System.out.println("good luck feeding him now");
        }


    }


    void TakeForAWalk() {
        weight--;
        if (weight > 0.0) {
            System.out.println("thx for taking me for walk, " + weight + "kg");
        } else {
            System.out.println("Your pet is dead, I hope  you are proud of yourself :)");
        }

    }

}