package transport;

public class Trucks extends Transport implements Competing  {
    private WeightTruck weightTruck;

    public Trucks(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeed,WeightTruck weightTruck) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeed);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public double getEngineVolume() {
        return super.getEngineVolume();
    }

    @Override
    public void setEngineVolume(double engineVolume) {
        super.setEngineVolume(engineVolume);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getProductionYear() {
        return super.getProductionYear();
    }

    @Override
    public String getProductionCountry() {
        return super.getProductionCountry();
    }

    public WeightTruck getWeightTruck() {
        return weightTruck;
    }

    public void setWeightTruck(WeightTruck weightTruck) {
        this.weightTruck = weightTruck;
    }

    @Override
    public void startMovement() {
    super.startMovement();
    }

    @Override
    public void endMovement() {
        super.endMovement();
    }

    @Override
    public void refill() {

    }


    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public double getMaxSpeedTransport() {
        return super.getMaxSpeedTransport();
    }

    @Override
    public void setMaxSpeed(double maxSpeed) {
        super.setMaxSpeed(maxSpeed);
    }

    @Override
    public String toString() {
        return "Trucks{}";
    }

}
