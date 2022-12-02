package transport;

public abstract class Transport {

    private String brand;
    private String model;

    private double engineVolume;

    private String color;
    private int productionYear;
    private String productionCountry;
    private double maxSpeedTransport;

    public Transport(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry, double maxSpeedTransport) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "Рукожопство";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "Самоделка";
        } else {
            this.model = model;
        }
        if (engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear < 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "Гондурас";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
        if (maxSpeedTransport < 0) {
            this.maxSpeedTransport = 0;
        } else {
            this.maxSpeedTransport = maxSpeedTransport;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }


    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public double getMaxSpeedTransport() {
        return maxSpeedTransport;
    }

    public void setMaxSpeed(double maxSpeed) {

    }

    public abstract void  refill();

    public void  startMovement(){
        System.out.println("Начать движение!");
    }

    public  void  endMovement(){
        System.out.println("Закончить движение!");
    }


}






