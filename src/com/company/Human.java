package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.Arrays;
import java.util.Comparator;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class Human implements Saleable, Comparator<Car> {

    public String firstName;
    public String lastName;
    Phone phone;
    Animal pet;
    private Double cash = 0.0;
    private Double lastSalary = 0.0;
    private Double salary = 0.0;
    public static final Integer DEFAULT_PARKING_SPACE = 2;
    public Car[] garage;


    public Human(String firstName, String lastName, Phone phone, Animal pet, Double cash, Double lastSalary, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
//        this.phone.Owner = this;
        this.pet = pet;
        this.cash = cash;
        this.lastSalary = lastSalary;
        this.salary = salary;
        garage = new Car[DEFAULT_PARKING_SPACE];

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(Double salary) {


        if (salary > 0) {
            System.out.println("New salary is now accounted in the accounting system");
            System.out.println("You need to pick up the annex to the contract from Mrs. Hania from human resources ");
            System.out.println("ZUS and US knows about your new salary, it makes no sense to hide the income");
            this.lastSalary = this.salary;
            this.salary = salary;

        } else
            System.out.println("You cannot put negative values here");
    }


    public Car getCar(Integer parkingSpaceNumber) {
        if (garage[parkingSpaceNumber] != null) {
            garage[parkingSpaceNumber].sellerParking = parkingSpaceNumber;
        }
        return garage[parkingSpaceNumber];

    }


    public void setCar(Integer parkingSpaceNumber, Car car) {
        if (car != null) {
            car.numberOfOwners++;
            car.listOfOwners.add(this);
        }
        garage[parkingSpaceNumber] = car;
    }

    public boolean isOwner(Car[] garage, Car car) {
        for (int i = 0; i <= garage.length - 1; i++) {
            if (car == this.garage[i])
                return true;
        }
        return false;
    }

    public double garageCarsValue() {

        double value = 0;
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] != null) {
                value = garage[i].value + value;
            }
        }
        System.out.println("Wartosc garazu " + this.firstName + " to: " + value);
        return value;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
//        this.phone.Owner = this;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal animal) {
        this.pet = pet;

    }

    public Double getSalary() {
        System.out.println("Your previous salary was: " + lastSalary);
        System.out.println("Your current salary accounted and its: " + salary + " Current date: " + date());
        return this.salary;
    }

    @Override
    public int compare(Car o1, Car o2) {
        {
            if (o2 == null) return -1;
            if (o1 == null) return -1;
            if (o1.yearOfProduction > o2.yearOfProduction) return 1;
            else if (o1.yearOfProduction < o2.yearOfProduction) return -1;
            else return 0;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", pet=" + pet +
                ", cash=" + cash +
                ", lastSalary=" + lastSalary +
                ", salary=" + salary +
                '}';

    }

    public void sortCar() {
        Arrays.sort(garage, this);
    }

    public void showCars() {
        System.out.println(firstName + " " + lastName + ": ");
        for (Car c : garage)
            System.out.println(c);
    }

    @Override
    public void Sell(Human seller, Human buyer, Double prize) {
        System.out.println("Slavery is forbidden");
    }


    public Double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }


}
