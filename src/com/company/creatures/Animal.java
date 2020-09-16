package com.company.creatures;

import com.company.Human;
import com.company.Saleable;

public abstract class Animal implements Saleable, Feedable {
    final String species;
    private Double weight;
    public String name;

    public static final Double DEFAULT_DOG_WEIGHT = 12.0;
    public static final Double DEFAULT_MOOSE_WEIGHT = 500.0;
    public static final Double DEFAULT_LION_WEIGHT = 180.0;


    public Animal(String species, Double weight, String name) {
        this.species = species;
        if (species == "lion") {
            this.weight = DEFAULT_LION_WEIGHT;
        } else if (species == "moose") {
            this.weight = DEFAULT_MOOSE_WEIGHT;
        } else if (species == "dog") {
            this.weight = DEFAULT_DOG_WEIGHT;
        }
        this.weight = weight;
        this.name = name;
    }


    void takeForAWalk() {
        weight--;
        if (weight > 0.0) {
            System.out.println("thx for taking me for walk, " + weight + "kg");
        } else {
            System.out.println("Your pet is dead, I hope  you are proud of yourself :)");
        }

    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public void feed(Double foodWeight) {
        setWeight(getWeight() + foodWeight);
        System.out.println("You feed this animal with " + foodWeight + " of food and it's weight is now: " + getWeight());
    }

    @Override
    public void feed() {
        System.out.println("You feed this animal ");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void Sell(Human seller, Human buyer, Double prize) {

        if (buyer.getCash() >= prize) {
            if (seller.getPet() == this) {
                buyer.setPet(seller.getPet());
                System.out.println("Transaction accepted");
                System.out.println("New owner of " + seller.getPet().species + " is now " + buyer.getFirstName());

                seller.setPet(null);

                seller.setCash(seller.getCash() + prize);
                buyer.setCash(buyer.getCash() - prize);
                System.out.println("Current cash of " + buyer.firstName + " is now: " + buyer.getCash() + "\n" + "Current cash of " + seller.firstName + " is now: " + seller.getCash());
            } else {
                System.out.println(seller.firstName + " doesn't have this pet ");
            }
        } else {
            System.out.println(buyer.firstName + " doesn't have the amount of money");
        }

    }
}