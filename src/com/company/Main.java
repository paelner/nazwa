package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws Exception {
        Phone iphone11 = new Phone("iphone 11", " apple", 6.1, 2019, "White", 2.100);
        Phone siajomi = new Phone("redmi note 8", "xiaomi", 6.53, 2019, "Black", 2.000);
        Car.Electric passeratti = new Car.Electric("Passeratti", "Volkswagen", 2.0, 2012, "Green", 23000.0);
        Animal.Pet moose = new Animal.Pet("moose", Animal.DEFAULT_MOOSE_WEIGHT, "Kłębek");
        Human me = new Human("Paweł", "Nerkowski", siajomi, moose, 10000.0, 10000.0, 10000.0);
        Car.Diesel bentley = new Car.Diesel("Mulsanne", "Bentley", 6.8, 2020, "Orange", 1000.0);
        Animal.Pet dog = new Animal.Pet("dog", Animal.DEFAULT_DOG_WEIGHT, "Akita");
        Animal.FarmAnimal cow = new Animal.FarmAnimal("cow", 200.0, "Krasula");
        Car.LPG zentorno = new Car.LPG("zentorno", "Pegassi", 6.0, 2005, "Blue", 2000.0);
//        me.setSalary(-1000.0);
//        me.setSalary(20000.0);
        String[] apps = {"d&d", "chess", "sudoku"};
        System.out.println(Arrays.toString(apps));
        Arrays.sort(apps);
        System.out.println(Arrays.toString(apps));
        System.out.println();
        Integer[] numbers = {10, 90, 0, -340};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        me.phone.installAnApp(apps);
//        me.setCar(1,zentorno);
//        me.setCar(0, bentley);
//        me.setCar(2,passeratti);
        Human Adam = new Human("Adam", "Berek", siajomi, dog, 200000.0, 20000.0, 10000.0);
        Human Damian = new Human("Damian", "Serek", siajomi, moose, 100000.0, 3000.0, 2000.0);
        System.out.println("\n \n");
        Damian.setCar(0, passeratti);
        Adam.setCar(1, zentorno);
//        Adam.setCar(0, bentley);
        passeratti.Sell(Damian, Adam, 20000.0);
        passeratti.getNumberOfSales();
        passeratti.transactionHistory();
        passeratti.Sell(Adam, Damian, 20000.0);
        passeratti.transactionHistory();
//        Adam.showCars();
//        bentley.refuel(20.0);
//        zentorno.refuel(10.0);
//        passeratti.refuel(5.0);
//        me.showCars();
//        me.sortCar();
//        me.showCars();
//        System.out.println("My car is: " + me.getCar(1).model);
        me.getSalary();
//        me.garageCarsValue();
        System.out.println("\n \n");
        passeratti.showOwnerList();
//        Car a1 = new Car("Passeratti", "Volkswagen", 2.1, 2012, "Green");
//        Car a2 = new Car("Passeratti", "Volkswagen", 2.1, 2012, "Green");

//        System.out.println(a1.equals(a2));
//        System.out.println(a1);
//        System.out.println(siajomi);
//        System.out.println(Adam);
//        System.out.println(dog);
        siajomi.turnOn();
//        Adam.showCars();
//        a1.turnOn();
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
        moose.feed(10.0);
        cow.feed();
        cow.beEaten();
//        Adam.getSalary();
//        Adam.Sell(Adam, me, 200.0);
//        iphone11.Sell(Damian, Adam, 2000.0);
//        bentley.Sell(Damian, me, 2.0);
//        siajomi.Sell(Damian, me, 1000.0);
//        moose.Sell(me, Damian, 20.0);

    }


}
