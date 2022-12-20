package transport.driver;

import transport.Transport;

import java.util.Objects;

public class Driver <T extends Transport>  {
    private String nameDriver;
    private String driverLicence;
    private int experienceDriver;


    public Driver(String nameDriver, String driverLicence, int experienceDriver) {
        this.nameDriver = nameDriver;
        this.driverLicence = driverLicence;
        this.experienceDriver = experienceDriver;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public void setNameDriver(String nameDriver) {
        this.nameDriver = nameDriver;
    }

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public int getExperienceDriver() {
        return experienceDriver;
    }

    public void setExperienceDriver(int experienceDriver) {
        this.experienceDriver = experienceDriver;
    }



    @Override
    public String toString() {
        return "Driver{" +
                "nameDriver='" + nameDriver + '\'' +
                ", driverLicence='" + driverLicence + '\'' +
                ", experienceDriver=" + experienceDriver +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return experienceDriver == driver.experienceDriver && nameDriver.equals(driver.nameDriver) && driverLicence.equals(driver.driverLicence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDriver, driverLicence, experienceDriver);
    }


}
