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
    public HashSet<Application> installedApplications = new HashSet<Application>();


    public Phone(String model, String producer, Double screenSize, Integer yearOfProduction, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.screenSize = screenSize;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
    }

    public Boolean hasThisPhone(Human owner) {
        if (owner.getPhone() == this) {
//            System.out.println(owner.firstName +" has this phone");
            return true;
        } else
//            System.out.println(owner.firstName+" doesn't have this phone");
            return false;
    }

    ;

    public void installAnApp(Human owner, Application application) {
        if (owner.getCash() >= application.priceApplication) {
            {
                if (this.hasThisPhone(owner) == true) {
                    System.out.println(owner.firstName + " is the owner");
                    this.installedApplications.add(application);
                    System.out.println(application.getNameApplication() + " is now installed on " + this.model);
                    owner.setCash(owner.getCash() - application.priceApplication);
//                    System.out.println(owner.getCash());
                } else System.out.println("Phone has no owner");
                return;
            }
        } else System.out.println(owner.firstName + " doesn't have enough money");
    }


    public Boolean appIsInstalled(Application application) {
        if (installedApplications.contains(application)) {
            System.out.println(application.getNameApplication() + " is installed on " + this.model);
            return true;
        }
        System.out.println(application.getNameApplication() + " isn't installed on " + this.model);
        return false;
    }


    public Boolean appIsInstalled(String applicationName) {
        Iterator<Application> it = installedApplications.iterator();
        while (it.hasNext()) {
            boolean installed = false;
            while (installed == false) {
                if (it.next().nameApplication.equals(applicationName)) {
                    System.out.println(applicationName + " is installed");
                    installed = true;
                    return true;
                }
            }
            return false;
        }
        return false;
    }


    public void showFreeApps() {
        Iterator<Application> it = installedApplications.iterator();
        System.out.println("Free aps: ");

        while (it.hasNext()) {
            System.out.println(it.next().priceApplication);
            if (it.next().priceApplication == 0.0) {
                System.out.println(it.next().nameApplication);

            }
        }
    }

    public void allInstalledApps() {
        Iterator<Application> it = installedApplications.iterator();
        System.out.println("Installed apps: \n");
        int n = 1;
        while (it.hasNext()) {
            System.out.println(n + " " + it.next().nameApplication);
            n++;
        }
    }

    public double sumOfAppsPrizes() {
        double value = 0;
        Iterator<Application> it = installedApplications.iterator();
        while (it.hasNext()) {
            value = value + it.next().priceApplication;
        }
        System.out.println("Sum of all apps: " + value);
        return value;
    }

    public void showAppsAlphabetically() {
        System.out.println("Apps sorted aplhabetically: ");
        List<Application> sortList = new ArrayList<>(installedApplications);
        Collections.sort(sortList);

        for (Application installedApplication : installedApplications) {
            System.out.print(installedApplication.nameApplication + ",   ");
        }
    }

    public void showAppsByPrizes() {
        System.out.println("Apps sorted by prizes: ");
        List<Application> sortList = new ArrayList<>(installedApplications);
        sortList.sort(new ApplicationPriceComparator());
        Iterator<Application> it = installedApplications.iterator();

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
