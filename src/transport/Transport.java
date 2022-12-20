package transport;

import transport.driver.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport {

    private String brand;
    private String model;

    private double engineVolume;

    private String color;
    private int productionYear;
    private String productionCountry;
    private double maxSpeedTransport;

    private static final List<Driver<?>> drivers = new ArrayList<>();
    private static final List<Mechanic<?>> mechaics = new ArrayList<>();
    private static final List<Sponsor<?>> sponsors = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume, String color, int productionYear,
                     String productionCountry, double maxSpeedTransport) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Рукожопство";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Самоделка";
        } else {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear < 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "Гондурас";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (maxSpeedTransport < 0) {
            this.maxSpeedTransport = 0;
        } else {
            this.maxSpeedTransport = maxSpeedTransport;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }


    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public double getMaxSpeedTransport() {
        return maxSpeedTransport;
    }

    public void setMaxSpeed(double maxSpeed) {




    }

    public abstract void printType();

    public  boolean service(){
        return false;
    }

    public static void addDriver(Driver<?> driver){
        drivers.add(driver);
    }
    public static void addMechanic(Mechanic<?> mechanic){
        mechaics.add(mechanic);
    }
    public static void addSponsor(Sponsor<?> sponsor){
        sponsors.add(sponsor);
    }



    public abstract void  refill();

    public void  startMovement(){
        System.out.println("Начать движение!");
    }

    public  void  endMovement(){
        System.out.println("Закончить движение!");
    }


    public abstract void repair();

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeedTransport=" + maxSpeedTransport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && productionYear == transport.productionYear && Double.compare(transport.maxSpeedTransport, maxSpeedTransport) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && color.equals(transport.color) && productionCountry.equals(transport.productionCountry) && drivers.equals(transport.drivers) && mechaics.equals(transport.mechaics) && sponsors.equals(transport.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeedTransport, drivers, mechaics, sponsors);
    }
}






