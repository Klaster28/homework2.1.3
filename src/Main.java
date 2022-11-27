import transport.Car;
import transport.Train;
import transport.Transport;

import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada ", "Granta", 1.7, "Желтый", 2015, "Россия","Автоматическая", "Хетчбек", 200,"п232пп23", "5", "Зимние",new Car.Key(), new Car.Insurance());
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия","Механика","Седан",168, "з111зз22","4","Летние",new Car.Key(), new Car.Insurance());
        Car bmw = new Car("BMW ", "Z8", 3.0, "Черный", 2021, "Германия","Автоматическая","Седан",210, "з323зз98","4","Зимние",new Car.Key(), new Car.Insurance());
        Car kia = new Car("KIA ", "Sportage 4 ", 2.4, "Красный", 2018, "Южная Корея","Механическая","Универсал",199, "л434лл43","5","Летние",new Car.Key(), new Car.Insurance());
        Car hundai = new Car("Hundai ", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея","Механическая","Седан",243, "п343пп55","5","Летние",new Car.Key(), new Car.Insurance());
        System.out.println();
        Train lastochka = new Train("Ласточка","B-901","Красный",2011,"Россия", 350, 3500, 3.5,"Москва", "Минск", 8);
        Train leningrad = new Train("ленинград","Д-125","Красно-белый",2019,"Россия", 270, 1500, 4.5,"Москва", "Ленинград", 11);


        printInfo(ladaGranta);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hundai);
        System.out.println();
        printInfo(lastochka);
        printInfo(leningrad);
        System.out.println();
        audi.changeTires();
        bmw.changeTires();
        kia.changeTires();
        hundai.changeTires();
        ladaGranta.changeTires();
        audi.isNormRegistrationNumber();
    }
    private static void printInfo(Car car) {
        System.out.println("Автомобиль: " + car.getBrand() + " " + car.getModel() +
                ". Двигатель - " + car.getEngineVolume() + " л. Цвет кузова - " + car.getColor() +
                ". Год выпуска - " + car.getProductionYear() + ". Страна производства - " +
                car.getProductionCountry() + ". Тип трансмиссии - " + car.getTransmission() +
                ". Тип кузова - " + car.getBodyType() + "Максимальная скорость - " + car.getMaxSpeed() + ". Регистрационный номер - " + car.getRegistrationNumber() +
                ". Количество мест - " + car.getNumberSeats() + ". Шины - " + car.getTireIndication() + ". " +
                (car.getKey().isKeylessAccess() ? "Бесключевой доступ." : "Ключевой доступ.") +
                (car.getKey().isRemoteEngineStart() ? "Дистанционный запуск." : " Обычный запуск.") +
                " Действие страховки - " + car.getInsurance().getInsuranceValidityPeriod() +
                " Стоимость страховки - " + car.getInsurance().getCostInsurance() + " руб. " +
                " Номер страхового полиса - " + car.getInsurance().getItrnsuranceNumber() + ". ");
    }
    private static void printInfo(Train train) {
        System.out.println("Поезд: " + train.getBrand() + " " + train.getModel() +
                " Цвет кузова - " + train.getColor() +
                ". Год выпуска - " + train.getProductionYear() + ". Страна производства - " +
                train.getProductionCountry() +  " . Максимальная скорость - " + train.getMaxSpeed() +
                " км/ч. Станция отправления - " +train.getNameDepartureStation()+ ". Станция назначения - "
                +train.getFinalStopStation()+ ". Количество вагонов в поезде - " +train.getNumberWagons()+
                "Время в пути - " +train.getTravelTime()+ "час. Стоимость поездки" +train.getCostTrip()+ " руб.");
    }



}