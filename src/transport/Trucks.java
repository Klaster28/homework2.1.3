package transport;

public class Trucks extends Transport {

    public Trucks(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeed) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeed);
    }

    @Override
    public void refill() {

    }
}
