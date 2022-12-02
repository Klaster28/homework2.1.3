package transport;

public class DriverC extends Trucks {

    private String nameDriver;
    private String driverLicence;
    private int experienceDriver;

    public DriverC(String nameDriver, int experienceDriver, String driverLicence, String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeedTransport) {
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
    public void startMovement(){

    }
    public  void  endMovement(){

    }

}
