package com.company.devices;

import com.company.Human;
import com.company.Saleable;

import java.util.Comparator;
import java.util.Scanner;

public abstract class Car extends Device implements Saleable, Comparator<Car> {

    public final Double engineCapacity;
    public final String color;

    Scanner scan = new Scanner(System.in);
    int buyerParking = 0;
    int sellerParking;

    public Car(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOFProduction;
        this.color = color;
        this.value = value;
    }


    public void setCarValue() {
        this.value = value;
    }

    public Double getCarValue() {
        return value;
    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    public abstract void refuel(Double fuel);

    @Override
    public int compare(Car o1, Car o2) {
        if (o2 == null) return -1;
        if (o1 == null) return -1;
        if (o1.yearOfProduction > o2.yearOfProduction) return 1;
        else if (o1.yearOfProduction < o2.yearOfProduction) return -1;
        else return 0;
    }

    @Override
    public void Sell(Human seller, Human buyer, Double prize) throws Exception {

        if (seller.getCar(sellerParking) != this)
            throw new Exception("Te miejsce jest puste");


        if (buyer.getCash() >= prize && seller.getCar(sellerParking) == this) {

            seller.setCash(seller.getCash() + prize);
            buyer.setCash(buyer.getCash() - prize);


            while (buyer.getCar(buyerParking) != null) {
                if (buyer.getCar(buyerParking) == null) {
                    break;
                }
                if ((buyer.garage.length - 1) == buyerParking && buyer.getCar(buyer.garage.length - 1) != null) {
                    throw new Exception("Wszystkie miejsca parkingowe są zajęte");
                }
                buyerParking = buyerParking + 1;
            }
            if (buyer.getCar(buyerParking) == null) {
                buyer.setCar(buyerParking, this);
                seller.setCar(sellerParking, null);
                System.out.println(
                        "Transakcja przebiegła pomyślnie " + "\n" +
                                "Current cash of " + buyer.firstName + " is now: " + buyer.getCash() + "\n" +
                                "Current cash of " + seller.firstName + " is now: " + seller.getCash());
            }
        } else throw new
                Exception(buyer.firstName + " nie ma tyle pieniędzy");
    }

    public static class Electric extends Car {

        public Electric(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color, Double value) {
            super(model, producer, engineCapacity, yearOFProduction, color, value);

        }


        @Override
        public void refuel(Double charge) {

            System.out.println("Naladowales elektryczny samochod  " + this.model + " o " + charge + " MJ");
        }


    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object instanceof Car) {
            Car o = (Car) object;
            if (model.equals(o.model) && producer.equals(o.producer) && engineCapacity.equals(o.engineCapacity) && yearOfProduction.equals(o.yearOfProduction) && color.equals(o.color) && value.equals(o.value)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = 11;
        result = 31 * result + model.hashCode();
        result = 31 * result + producer.hashCode();
        result = 31 * result + engineCapacity.hashCode();
        result = 31 * result + yearOfProduction.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + value.hashCode();
        return result;
    }

    @Override
    public void turnOn() {
        System.out.println("Device " + model + " is turned on");

    }

    public static class Diesel extends Car {

        public Diesel(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color, Double value) {
            super(model, producer, engineCapacity, yearOFProduction, color, value);
        }

        @Override
        public void refuel(Double fuel) {
            System.out.println("Napelniles bak samochodu " + this.model + " o " + fuel + " litrow paliwa");
        }


    }

    public static class LPG extends Car {

        public LPG(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color, Double value) {
            super(model, producer, engineCapacity, yearOFProduction, color, value);
        }

        @Override
        public void refuel(Double gas) {

            System.out.println("Napelniles butle " + this.model + " o " + gas + " litrow gazu");
        }


    }
}

