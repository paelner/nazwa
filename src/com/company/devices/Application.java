package com.company.devices;

public class Application implements Comparable {
    public String nameApplication;
    public Double versionOfApplication;
    public Double priceApplication;

    public Application(String nameApplication, Double versionOfApplication, Double priceApplication) {
        this.nameApplication = nameApplication;
        this.versionOfApplication = versionOfApplication;
        this.priceApplication = priceApplication;
    }

    public String getNameApplication() {
        return nameApplication;
    }

    public void setNameApplication(String nameApplication) {
        this.nameApplication = nameApplication;
    }

    public Double getVersionOfApplication() {
        return versionOfApplication;
    }

    public void setVersionOfApplication(Double versionOfApplication) {
        this.versionOfApplication = versionOfApplication;
    }

    public Double getPriceApplication() {
        return priceApplication;
    }

    public void setPriceApplication(Double priceApplication) {
        this.priceApplication = priceApplication;
    }


    @Override
    public int compareTo(Object o) {
        return this.nameApplication.compareTo(((Application) o).nameApplication);
    }

}