package com.company.devices;

import com.company.ApplicationPriceComparator;
import com.company.Human;
import com.company.Saleable;

import java.util.*;

public class Phone extends Device implements Saleable {
    public final Double screenSize;
    public final String color;
    public Double value;
    private static final String DEFAULT_APP_PROTOCOL = "HTTPS";
    private static final String DEFAULT_APP_SERVER = "me.appstore.com";
    private static final int DEFAULT_PORT_NUMBER = 443;
    public HashSet<Application> setApplication = new HashSet<Application>();
    public Human Owner;


    public Phone(String model, String producer, Double screenSize, Integer yearOfProduction, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.screenSize = screenSize;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.value = 200.0;
    }

    public void installAnApp(Application application) throws Exception {
        if (Owner.getCash() >= application.priceApplication) {
            if (Owner == null)
                throw new Exception("Telefon nie ma właściciela");
            setApplication.add(application);
            Owner.setCash(Owner.getCash() - application.priceApplication);
        } else System.out.println(Owner.firstName + " nie ma tyle pieniędzy");
    }

    public void appIsInstalled(Application application) {
        if (setApplication.contains(application))
            System.out.println("Ta aplikacja jest zainstalowana");
        else if (!setApplication.contains(application)) System.out.println("Ta aplikacja nie jest zainstalowana");

    }

    public void appIsInstalled(String applicationName) {
        Iterator<Application> it = setApplication.iterator();
        boolean isInstalled = false;
        while (it.hasNext()) {
            if (it.next().nameApplication == applicationName)
                isInstalled = true;
        }
        if (isInstalled == true) {
            System.out.println("Ta aplikacja jest zainstalowana");
        } else System.out.println("Ta aplikacja nie jest zainstalowana");
    }

//    public void showFreeApps() {
//        Iterator<Application> it = setApplication.iterator();
////        List <Application> freeApps = new ArrayList<Application>(setApplication);
////        Collections.sort(freeApps);
//        System.out.println("Darmowe aplikacje: ");
//        if (setApplication.iterator().next().priceApplication == 0.0) {
//            System.out.println(setApplication.iterator().next().nameApplication);
//            while (it.hasNext()) {
//                if (it.next().priceApplication == 0.0) {
//                    System.out.println(it.next().nameApplication);
//                }
//            }
//        }
//    }

    public double sum_Of_APP_Values() {
        double value = 0;
        Iterator<Application> it = setApplication.iterator();
        while (it.hasNext()) {
            value = value + it.next().priceApplication;
        }
        return value;
    }

    public void showAppsAlphabetically() {
        List<Application> sortList = new ArrayList<>(setApplication);
        Collections.sort(sortList);
        Iterator<Application> it = setApplication.iterator();

        while (it.hasNext()) {
            System.out.print(it.next().nameApplication + ",   ");
        }
    }

    public void showAppsByPrice() {
        List<Application> sortList = new ArrayList<>(setApplication);
        Collections.sort(sortList, new ApplicationPriceComparator());
        Iterator<Application> it = setApplication.iterator();
        while (it.hasNext()) {
            System.out.print(it.next().nameApplication + ",   ");
        }
    }
//    public void installAnApp(String[] names) throws Exception {
//        System.out.println("instalowanie aplikacji na podstawie tablicy nazw");
//        if (names.length == 0) {
//            throw new Exception("nie podano żadnych plikacji");
//        }
//        for (String name : names) {
//            this.installAnApp(name);
//        }
//    }

//    public void installAnApp(String name) throws Exception {
//        System.out.println("instalowanie aplikacji na podstawie nazwy");
//        if (name.equals("")) {
//            throw new Exception("aplikacja musi mieć nazwę");
//        }
//        this.installAnApp(name, "latest");
//    }

//    public void installAnApp(String name, String version) throws MalformedURLException {
//        System.out.println("instalowanie aplikacji na podstawie nazwy i wersji");
//
//        URL url = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_PORT_NUMBER, name + "-" + version);
//        this.installAnApp(url);
//    }

//    public void installAnApp(URL url) {
//        System.out.println("instalowanie aplikacji na podstawie url");
//
//        System.out.println("poprawnie zainstalowano " + url.getFile() + " z serwera " + url.getHost());
//    }

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
                System.out.println("Transaction accepted");
                System.out.println("New owner of " + seller.getPhone().model + " is now " + buyer.getFirstName());
                seller.setPhone(null);

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
