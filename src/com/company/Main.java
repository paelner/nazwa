package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {


    public static void main(String[] args) throws Exception {
        double z = 10;
//        Phone iphone11 = new Phone("iphone 11", " apple", 6.1, 2019, "White", 2.100);
        Phone siajomi = new Phone("redmi note 8", "xiaomi", 6.53, 2019, "Black", 2.000);
        Electric passeratti = new Electric("Passeratti", "Volkswagen", 2.0, 2012, "Green", 23000.0);
        Pet moose = new Pet("moose", Animal.DEFAULT_MOOSE_WEIGHT, "Kłębek");
        Human me = new Human("Paweł", "Nerkowski", siajomi, moose, 10000.0, 10000.0, 10000.0);
        Diesel bentley = new Diesel("Mulsanne", "Bentley", 6.8, 2020, "Orange", 1000.0);
        Pet dog = new Pet("dog", Animal.DEFAULT_DOG_WEIGHT, "Akita");
        FarmAnimal cow = new FarmAnimal("cow", 200.0, "Krasula");
        LPG zentorno = new LPG("zentorno", "Pegassi", 6.0, 2005, "Blue", 2000.0);

//        zentorno.refuel(1.);
//        passeratti.refuel(2.);
//        bentley.refuel(3.);
//        me.setSalary(-1000.0);
//        me.setSalary(20000.0);
//        String[] apps = {"d&d", "chess", "sudoku"};
//        System.out.println(Arrays.toString(apps));
//        Arrays.sort(apps);
//        System.out.println(Arrays.toString(apps));
//        System.out.println();
//        Integer[] numbers = {10, 90, 0, -340};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        Application Sudoku = new Application("Sudoku", 1.0, 120.0);
//        Application TFT = new Application("Teamfight Tactics", 1.2, 0.0);
//        Application TribalWars = new Application("Tribal Wars", 3.0, 10.0);
//        Application Pyszne = new Application("Pysznepl", 1.2, 0.0);
//        me.getPhone();
//        me.getPhone().appIsInstalled(Sudoku);
//        me.getPhone().appIsInstalled(TribalWars);
//        installAnApp(Sudoku);
//        installAnApp(TFT);
//        me.getPhone().sum_Of_APP_Values();

//        me.getPhone().installAnApp(TribalWars);
//        me.getPhone().installAnApp(TFT);
//        me.getPhone().installAnApp(Sudoku);
//        me.getPhone().installAnApp(Pyszne);
//        me.getPhone().appIsInstalled(Sudoku);
//        me.getPhone().appIsInstalled(TribalWars);
//        me.setSalary(100.0);
//        me.getSalary();
//        me.getPhone().showFreeApps();
//        me.getPhone().showAppsByPrice();
        System.out.println("\n");
//        me.getPhone().showAppsAlphabetically();


//        me.setCar(1,zentorno);
//        me.setCar(0, bentley);
//        me.setCar(2,passeratti);
        Human Adam = new Human("Adam", "Berek", siajomi, null, 200000.0, 20000.0, 10000.0);
        Human Damian = new Human("Damian", "Serek", null, moose, 100000.0, 3000.0, 2000.0);

//        System.out.println("\n \n");
        Damian.setCar(0, passeratti);
        Adam.setCar(1, zentorno);
//        Adam.setCar(0, bentley);
        passeratti.Sell(Damian, Adam, 20.0);
        System.out.println("\n");
        System.out.println(Damian.getCar(0));
        System.out.println(Adam.getCar(0) + " " + Adam.getCar(1));
//        passeratti.Sell(Damian, Adam, 20000.0);
//        passeratti.getNumberOfSales();
//        passeratti.transactionHistory();
//        passeratti.Sell(Adam, Damian, 20000.0);
        System.out.println("\n");
//        passeratti.transactionHistory();
//        passeratti.getNumberOfSales();

        System.out.println("\n");

//        siajomi.Sell(Adam, Damian, 1000.0);
//        moose.Sell(Damian, Adam, 200.0);
//        cow.beEaten();
//        cow.feed(10.);
//        cow.feed();
//
//        moose.feed();
//        moose.feed(10.);

//        Adam.Sell(me, Damian, 100.0);
//        Adam.showCars();
//        bentley.refuel(20.0);
//        zentorno.refuel(10.0);
//        passeratti.refuel(5.0);
//        me.showCars();
//        me.sortCar();
//        me.showCars();
//        System.out.println("My car is: " + me.getCar(1).model);
//        me.getSalary();
//        me.garageCarsValue();ric("Passeratti", "Volkswagen", 2.1, 2012, "Green", 100.0);
////        Car.Electric a2 = new Car.Electric("Passeratti", "Volkswagen", 2.1, 2012, "Green", 100.0);
////
////
////        System.out.println(a1.equals(a2));
////        System.out.println();
//        System.out.println("\n \n");
//        passeratti.showOwnerList();
//        Car.Electric a1 = new Car.Elect

//        System.out.println(a1);
//        System.out.println(siajomi);
//        System.out.println(Adam);
//        System.out.println(dog);
//        siajomi.turnOn();
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
//        moose.feed(10.0);
//        cow.feed();
//        cow.beEaten();
//        Adam.getSalary();
//        Adam.Sell(Adam, me, 200.0);
//        iphone11.Sell(Damian, Adam, 2000.0);
//        bentley.Sell(Damian, me, 2.0);
//        siajomi.Sell(Damian, me, 1000.0);
//        moose.Sell(me, Damian, 20.0);

    }


}
