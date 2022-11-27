package transport;

public class Train extends Transport {
    private double costTrip;
    private double travelTime;
    private String nameDepartureStation;
    private String finalStopStation;
    private int numberWagons;

    public Train(String brand, String model, String color, int productionYear, String productionCountry, double maxSpeed, double costTrip, double travelTime, String nameDepartureStation, String finalStopStation, int numberWagons) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed);
        this.costTrip = costTrip;
        this.travelTime = travelTime;
        this.nameDepartureStation = nameDepartureStation;
        this.finalStopStation = finalStopStation;
        this.numberWagons = numberWagons;
    }

    public double getCostTrip() {
        return costTrip;
    }

    public void setCostTrip(double costTrip) {
        this.costTrip = costTrip;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        this.nameDepartureStation = nameDepartureStation;
    }

    public String getFinalStopStation() {
        return finalStopStation;
    }

    public void setFinalStopStation(String finalStopStation) {
        this.finalStopStation = finalStopStation;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        this.numberWagons = numberWagons;
    }
}
