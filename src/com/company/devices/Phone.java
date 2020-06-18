package com.company.devices;

import com.company.Human;
import com.company.Saleable;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device implements Saleable {
    public final Double screenSize;
    public final String color;
    public Double value;
    private static final String DEFAULT_APP_PROTOCOL = "HTTPS";
    private static final String DEFAULT_APP_SERVER = "me.appstore.com";
    private static final int DEFAULT_PORT_NUMBER = 443;


    public Phone(String model, String producer, Double screenSize, Integer yearOfProduction, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.screenSize = screenSize;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.value = 200.0;

    }

    public void installAnApp(String[] names) throws Exception {
        System.out.println("instalowanie aplikacji na podstawie tablicy nazw");
        if (names.length == 0) {
            throw new Exception("nie podano żadnych plikacji");
        }
        for (String name : names) {
            this.installAnApp(name);
        }
    }

    public void installAnApp(String name) throws Exception {
        System.out.println("instalowanie aplikacji na podstawie nazwy");
        if (name.equals("")) {
            throw new Exception("aplikacja musi mieć nazwę");
        }
        this.installAnApp(name, "latest");
    }

    public void installAnApp(String name, String version) throws MalformedURLException {
        System.out.println("instalowanie aplikacji na podstawie nazwy i wersji");

        URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_PORT_NUMBER, name + "-" + version);
        this.installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("instalowanie aplikacji na podstawie url");

        System.out.println("poprawnie zainstalowano " + url.getFile() + " z serwera " + url.getHost());
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", screenSize=" + screenSize +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Device " + model + " is turned on");

    }

    @Override
    public void Sell(Human seller, Human buyer, Double prize) {

        if (buyer.getCash() >= prize) {
            if (seller.getPhone() == this) {
                buyer.setPhone(seller.getPhone());
                seller.setCash(seller.getCash() + prize);
                buyer.setCash(buyer.getCash() - prize);
                System.out.println("Current cash of " + buyer.firstName + " is now: " + buyer.getCash() + "\n" + "Current cash of " + seller.firstName + " is now: " + seller.getCash());
            } else {
                System.out.println(seller.firstName + " doesn't have this phone ");
            }
        } else {
            System.out.println(buyer.firstName + " doesn't have the amount of money");
        }

    }
}
