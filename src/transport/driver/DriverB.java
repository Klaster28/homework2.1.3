package transport.driver;

import transport.Car;

import java.util.Objects;

public class DriverB extends Driver {


    public DriverB(String brand, String model, double engineVolume, String color, int productionYear,
                   String productionCountry, double maxSpeedTransport, String nameDriver, String driverLicence,
                   int experienceDriver) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeedTransport, nameDriver,
                driverLicence, experienceDriver);
    }

     @Override
    public void refill() {

    }

    public void startMovement() {

    }

    public void endMovement() {

    }

    @Override
    public String toString() {
        return "DriverB{}";
    }

}



