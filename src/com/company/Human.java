package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class Human implements Saleable {

    public String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Double cash = 0.0;
    private Double lastSalary = 0.0;
    private Double salary = 0.0;
    private Car car;

    public Human(String firstName, String lastName, Phone phone, Animal pet, Double cash, Double lastSalary, Double salary, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
        this.cash = cash;
        this.lastSalary = lastSalary;
        this.salary = salary;
        this.car = car;
    }


    public void setSalary(Double salary) {
        if (salary >= 0) {
            this.lastSalary = this.salary;
            this.salary = salary;
        } else
            System.out.println("You cannot put negative values here");
    }



    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (this.salary > car.value) {
            System.out.println("Bought this car with cash");
            this.car = car;
        } else if (this.salary > car.value / 12) {
            System.out.println("Bought this car on an installment plan");
            this.car = car;
        } else {
            System.out.println("you can't afford it :(");
        }
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
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
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", pet=" + pet +
                ", cash=" + cash +
                ", lastSalary=" + lastSalary +
                ", salary=" + salary +
                ", car=" + car +
                '}';

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
