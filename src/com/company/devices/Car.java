package com.company.devices;

import com.company.Human;
import com.company.Saleable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public abstract class Car extends Device implements Saleable, Comparator<Car> {

    public final Double engineCapacity;
    public final String color;
    public List<Human> owners = new ArrayList<>();
    public int sellerParking;


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
        this.value = prize;

        if (seller.isOwner(seller.garage, this)) {
            if (buyer.getCash() >= prize) {
                for (int i = 0; i < buyer.garage.length; i++) {
                    if (buyer.getCar(i) == null) {
//                        transactions.add(seller);
//                        transactions.add(buyer);
                        buyer.setCar(i, seller.getCar(sellerParking));
                        seller.setCar(sellerParking, null);
                        seller.setCash(seller.getCash() + prize);
                        buyer.setCash(buyer.getCash() - prize);

//                        retailPrize.add(prize);
                        System.out.println(

                                "Transaction accepted " + "\n" +
                                        "Current cash of " + buyer.firstName + " is now: " + buyer.getCash() + "\n" +
                                        "Current cash of " + seller.firstName + " is now: " + seller.getCash());
                        break;
                    }
                    if ((buyer.garage.length - 1) == i && buyer.getCar(buyer.garage.length - 1) != null) {
                        throw new Exception("All parking spaces are full");
                    }
                }

            } else throw new
                    Exception(buyer.firstName + " doesn't have enough money");
        } else throw new
                Exception(seller.firstName + " doesn't have this car");
    }

    public boolean alreadyOwned(Human firstOwner) {
        if (this.owners.contains(firstOwner)) {
            System.out.println(this.model + " was already owned by " + firstOwner.firstName);
            return true;
        }
        System.out.println(this.model + " wasn't owned by " + firstOwner.firstName);
        return false;
    }


    public void isSold(Human seller, Human buyer) {
        if (alreadyOwned(seller) && alreadyOwned(buyer)) {
            int sellerPosition = 0;
            int buyerPosition = 0;
            sellerPosition = this.owners.indexOf(seller);
            buyerPosition = this.owners.indexOf(buyer);
            if (sellerPosition + 1 == buyerPosition) {
                System.out.println(this.model + " was sold by " + seller.firstName + " to " + buyer.firstName);
                return;
            }
            System.out.println(this.model + " wasn't sold by " + seller.firstName + " to " + buyer.firstName);
        }
    }

    public void numberOfSales() {
        System.out.println("Number of Sales of " + this.model + ": " + (owners.size() - 1));
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
            if (model.equals(o.model) && producer.equals(o.producer) && engineCapacity.equals(o.engineCapacity) && yearOfProduction.equals(o.yearOfProduction)
                    && color.equals(o.color) && value.equals(o.value)) {
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
}

