package transport;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private String numberSeats;
    private String tireIndication;

    public Car(String brand, String model, double engineVolume,
        String color, int productionYear, String productionCountry,
        String transmission,String bodyType,String registrationNumber,
        String numberSeats,String tireIndication) {

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
        if (color == null || brand.isEmpty() || brand.isBlank()){
            this.transmission = "default";
        }else {
            this.transmission = transmission;
        }
        if (color == null || brand.isEmpty() || brand.isBlank()){
            this.bodyType = "default";
        }else {
            this.bodyType = bodyType;
        }
        if (color == null || brand.isEmpty() || brand.isBlank()){
            this.registrationNumber = "default";
        }else {
            this.registrationNumber = registrationNumber;
        }
        if (color == null || brand.isEmpty() || brand.isBlank()){
            this.numberSeats = "default";
        }else {
            this.numberSeats = numberSeats;
        }
        if (color == null || brand.isEmpty() || brand.isBlank()){
            this.tireIndication = "default";
        }else {
            this.tireIndication = tireIndication;
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

    public String getBodyType() {
        return bodyType;
    }

    public String getNumberSeats() {
        return numberSeats;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getTireIndication() {
        return tireIndication;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberSeats(String numberSeats) {
        this.numberSeats = numberSeats;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTireIndication(String tireIndication) {
        this.tireIndication = tireIndication;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
