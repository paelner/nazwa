package com.company.devices;


public class Car {
    public final String model;
    public final String producer;
    public final Double engineCapacity;
    public final Integer yearOfProduction;
    public final String color;
    public Double value;


    public Car(String model, String producer, Double engineCapacity, Integer yearOFProduction, String color) {
        this.model = model;
        this.producer = producer;
        this.engineCapacity = engineCapacity;
        this.yearOfProduction = yearOFProduction;
        this.color = color;
        this.value = 10000.0;
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
}
