package transport;

public class Bus extends Transport{
    public Bus(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeed) {
        super(brand, model,engineVolume, color, productionYear, productionCountry, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправьте автобус топливом на заправке!!! - Бензин/Дизель");
    }
}
