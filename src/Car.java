public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
   private int productionYear;
    private String productionCountry;


    Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
       if (brand == null || brand.isEmpty() || brand.isBlank()){
           this.brand = "default";
       }else {
           this.brand = brand;
       }

        if (model == null || brand.isEmpty() || brand.isBlank()){
            this.model = "default";
        }else {
            this.model = model;
        }

        if (engineVolume < 0){
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || brand.isEmpty() || brand.isBlank()){
            this.color = "белый";
        }else {
            this.color = color;
        }

        if (productionYear < 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

}
