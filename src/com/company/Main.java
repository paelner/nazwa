package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;
public class Main {


    public static void main(String[] args) {
        Phone iphone11 = new Phone("iphone 11", " apple", 6.1, 2019, "White", 2.100);
        Phone siajomi = new Phone("redmi note 8", "xiaomi", 6.53, 2019, "Black", 2.000);
        Car passeratti = new Car("Passeratti", "Volkswagen", 2.0, 2012, "Green");
        Animal moose = new Animal("moose", Animal.DEFAULT_MOOSE_WEIGHT, "Kłębek");
        Human me = new Human("Paweł", "Nerkowski", siajomi, moose, 10000.0, 10000.0, 10000.0, passeratti);
        Car bentley = new Car("Mulsanne", "Bentley", 6.8, 2020, "Orange");
        Animal dog = new Animal("dog", Animal.DEFAULT_DOG_WEIGHT, "Akita");

//        me.setSalary(-1000.0);
//        me.setSalary(20000.0);


        System.out.println("My car is: " + me.getCar().model);
        me.getSalary();

        System.out.println("\n \n");
        Car a1 = new Car("Passeratti", "Volkswagen", 2.1, 2012, "Green");
        Car a2 = new Car("Passeratti", "Volkswagen", 2.1, 2012, "Green");
        Human Adam = new Human("Adam", "Berek", siajomi, dog, 4000.0, 20000.0, 10000.0, a1);
        Human Damian = new Human("Damian", "Serek", siajomi, moose, 100.0, 3000.0, 2000.0, a2);
//        System.out.println(a1.equals(a2));
//        System.out.println(a1);
//        System.out.println(siajomi);
//        System.out.println(Adam);
//        System.out.println(dog);
        siajomi.turnOn();
        a1.turnOn();
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

        Adam.getSalary();
        Adam.Sell(Adam, me, 200.0);
        iphone11.Sell(Damian, Adam, 2000.0);
        bentley.Sell(Damian, me, 2.0);
        siajomi.Sell(Damian, me, 1000.0);
        moose.Sell(me, Damian, 20.0);

    }


}
