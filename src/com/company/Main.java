package com.company;

public class Main {

    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Paweł";
        me.lastName = "Nerkowski";
        me.pet = new Animal("moose");
        me.pet.name = "Kłębek";

        Animal dog = new Animal("dog");
        dog.name = "Akita";
        me.pet = dog;
        me.setSalary(30000.0);
        Car passeratti = new Car("Volkswagen", "Passeratti", 2.0, 2012, "Green");

        me.setCar(passeratti);
        System.out.println("My car is: " + me.getCar().model);
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.TakeForAWalk();
//        me.pet.feed();
//        me.pet.feed();
//        me.pet.feed();


    }

}
