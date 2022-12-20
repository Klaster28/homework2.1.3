package transport.driver;

import transport.CapacityBus;

public class DriverD extends Driver{


    public DriverD(String nameDriver, String driverLicence, int experienceDriver) {
        super(nameDriver, driverLicence, experienceDriver);
    }

    @Override
    public String getNameDriver() {
        return super.getNameDriver();
    }

    @Override
    public void setNameDriver(String nameDriver) {
        super.setNameDriver(nameDriver);
    }

    @Override
    public String getDriverLicence() {
        return super.getDriverLicence();
    }

    @Override
    public void setDriverLicence(String driverLicence) {
        super.setDriverLicence(driverLicence);
    }

    @Override
    public int getExperienceDriver() {
        return super.getExperienceDriver();
    }

    @Override
    public void setExperienceDriver(int experienceDriver) {
        super.setExperienceDriver(experienceDriver);
    }
}
