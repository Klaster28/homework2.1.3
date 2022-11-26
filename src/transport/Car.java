package transport;

import java.time.LocalDate;

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
    private Key key;
    private Insurance insurance;


    public Car(String brand, String model, double engineVolume,
               String color, int productionYear, String productionCountry,
               String transmission, String bodyType, String registrationNumber,
               String numberSeats, String tireIndication, Key key, Insurance insurance) {

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
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "Механическая";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "ф000фф00";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberSeats == null || numberSeats.isEmpty() || numberSeats.isBlank()) {
            this.numberSeats = "5";
        } else {
            this.numberSeats = numberSeats;
        }
        if (tireIndication == null || tireIndication.isEmpty() || tireIndication.isBlank()) {
            this.numberSeats = "Летние";
        } else {
            this.tireIndication = tireIndication;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
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


    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }


    public String getTireIndication() {
        return tireIndication;
    }

    public void setTireIndication(String tireIndication) {
        this.tireIndication = tireIndication;
    }

    LocalDate today = LocalDate.now();
    LocalDate changeTiresWinter = LocalDate.of(2023, 11, 1);
    LocalDate changeTiresSummer = LocalDate.of(2023, 4, 1);

    public String changeTires() {
        if (changeTiresWinter == today) {
            System.out.println("Сменить шины на зимние!");
        }
        if (changeTiresSummer == today) {
            System.out.println("сменить шины на летние!");
        } else {
            return null;
        }
        return null;
    }

    public boolean isNormRegistrationNumber() {
        if (registrationNumber.length() != 8) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) && Character.isDigit(chars[7])) {
            return false;
        }
        return true;
    }


    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public  Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.keylessAccess = keylessAccess;
            this.remoteEngineStart = remoteEngineStart;

        }
        public Key() {
            this(false, false);
        }



        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }


    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public static class Insurance {
        private final LocalDate insuranceValidityPeriod;
        private final double costInsurance;
        private final String itrnsuranceNumber;


            public Insurance (LocalDate insuranceValidityPeriod, double costInsurance, String itrnsuranceNumber) {
            if (insuranceValidityPeriod == null) {
                this.insuranceValidityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }
            if (costInsurance < 0) {
                this.costInsurance = 0;
            } else {
                this.costInsurance = costInsurance;
            }
            if (itrnsuranceNumber == null) {
                this.itrnsuranceNumber = "123456789";
            } else {
                this.itrnsuranceNumber = itrnsuranceNumber;
            }

        }
       public Insurance(){
           this(null, 3000, "234567872");
       }

            public double getCostInsurance() {
                return costInsurance;
            }

            public LocalDate getInsuranceValidityPeriod() {
                return insuranceValidityPeriod;
            }

            public String getItrnsuranceNumber() {
                return itrnsuranceNumber;
            }

            public void insuranceCheck() {
                if (insuranceValidityPeriod.isBefore(LocalDate.now()) || insuranceValidityPeriod.isEqual(LocalDate.now())) {
                    System.out.println("Срочно! Сегодня необходимо оформить страховку!!!");

                }
            }

            public void itrnsuranceNumberChek() {
                if (itrnsuranceNumber.length() != 9) {
                    System.out.println("Номер страховки не корректен!");
                }
            }
        }
}




