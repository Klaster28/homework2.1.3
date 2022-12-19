package transport;


import java.util.Objects;

public class Bus extends Transport implements Competing {

    private CapacityBus capacityBus;
    public Bus(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeedTransport, CapacityBus capacityBus) {
        super(brand, model, engineVolume, color, productionYear, productionCountry, maxSpeedTransport);

        this.capacityBus = capacityBus;
    }
    public void printType(){
        if (capacityBus == null){
            System.out.println("Данных по автобусу не достаточно!");
        }else {
            System.out.println("Пассажировместимость автобуса  от - " + capacityBus.getFrom()+ " чел. до " +capacityBus.getTo() +" чел.");
        }
    }

    @Override
    public void endMovement() {
        super.endMovement();
    }

    public CapacityBus getCapacityBus() {
        return capacityBus;
    }

    public void setCapacityBus(CapacityBus capacityBus) {
        this.capacityBus = capacityBus;
    }

    @Override
    public boolean service() {
        System.out.println("Автобус" + getBrand()+ " " +getModel() +" в диагоностике не нуждается");
        return true;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль " + getBrand()+ " " + getModel() + " отремонтирован!");
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

        return super.getMaxSpeedTransport();

    }

    @Override
    public String toString() {
        return "Bus{" +
                "capacityBus=" + capacityBus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return capacityBus == bus.capacityBus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacityBus);
    }
}
