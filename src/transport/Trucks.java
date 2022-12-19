package transport;

public class Trucks extends Transport implements Competing  {
    private WeightTruck weightTruck;

    public Trucks(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeedTransport, WeightTruck weightTruck) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeedTransport);

    this.weightTruck = weightTruck;
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

    public void printType(){
        if (weightTruck == null){
            System.out.println("Данных по грузовику не достаточно!");
        }else {
            System.out.println("Грузоподъемность грузовика от - " + weightTruck.getFrom()+ " т. до " +weightTruck.getTo() +" т.");
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.75;
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
    public void repair() {
        System.out.println("Автомобиль " + getBrand()+ " " + getModel() + " отремонтирован!");
    }

    @Override
    public String toString() {
        return "Trucks{}";
    }

}
