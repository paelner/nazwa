package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Paweł";
        me.lastName = "Nerkowski";
        me.pet = new Animal("moose");
        me.pet.name = "Kłębek";

        Animal dog = new Animal ("dog");
        dog.name = "Akita";
        me.pet = dog;
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.TakeForAWalk();
        me.pet.feed();
        me.pet.feed();






        }

}
