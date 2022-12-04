package transport;


public class Bus extends Transport implements Competing {

    private CapacityBus capacityBus;
    public Bus(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeed,CapacityBus capacityBus) {
        super(brand, model,engineVolume, color, productionYear, productionCountry, maxSpeed);
    }



    @Override
    public void endMovement() {
        super.endMovement();
    }



    @Override
    public void refill() {
        System.out.println("Заправьте автобус топливом на заправке!!! - Бензин/Дизель");
    }

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime() {

    }

    @Override
    public double getMaxSpeedTransport() {

        return 0;
    }


}
