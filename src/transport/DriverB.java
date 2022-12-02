package transport;

import java.util.Objects;

public class DriverB extends Car implements Competing  {
    private String nameDriver;
    private String driverLicence;
    private int experienceDriver;

    public DriverB(String nameDriver, int experienceDriver, String driverLicence, String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeedTransport) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeedTransport);
        this.driverLicence = driverLicence;
        this.nameDriver = nameDriver;
        this.experienceDriver = experienceDriver;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public int getExperienceDriver() {
        return experienceDriver;
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
        return "DriverB{" +
                "nameDriver='" + nameDriver + '\'' +
                ", driverLicence='" + driverLicence + '\'' +
                ", experienceDriver=" + experienceDriver +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverB driverB = (DriverB) o;
        return experienceDriver == driverB.experienceDriver && nameDriver.equals(driverB.nameDriver) && driverLicence.equals(driverB.driverLicence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDriver, driverLicence, experienceDriver);
    }
}


