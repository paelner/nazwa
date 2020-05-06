package com.company;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Double lastSalary = 0.0;
    private Double salary = 0.0;
    private Car car;

    public Double getSalary() {
        System.out.println("Your previous salary was: " + lastSalary);
        System.out.println("Your current salary accounted and its: " + salary);
        return this.salary;
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
}
