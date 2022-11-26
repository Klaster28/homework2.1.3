import transport.Car;

import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada ", "Granta", 1.7, "Желтый", 2015, "Россия","Автоматическая", "Хетчбек", "п232пп23", "5", "Зимние",new Car.Key(), new Car.Insurance());
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия","Механика","Седан","з111зз22","4","Летние",new Car.Key(), new Car.Insurance());
        Car bmw = new Car("BMW ", "Z8", 3.0, "Черный", 2021, "Германия","Автоматическая","Седан","з323зз98","4","Зимние",new Car.Key(), new Car.Insurance());
        Car kia = new Car("KIA ", "Sportage 4 ", 2.4, "Красный", 2018, "Южная Корея","Механическая","Универсал","л434лл43","5","Летние",new Car.Key(), new Car.Insurance());
        Car hundai = new Car("Hundai ", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея","Механическая","Седан","п343пп55","5","Летние",new Car.Key(), new Car.Insurance());

        printInfo(ladaGranta);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hundai);
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
                ". Тип кузова - " + car.getBodyType() + ". Регистрационный номер - " + car.getRegistrationNumber() +
                ". Количество мест - " + car.getNumberSeats() + ". Шины - " + car.getTireIndication() + ". " +
                (car.getKey().isKeylessAccess() ? "Бесключевой доступ" : "Ключевой доступ") +
                (car.getKey().isRemoteEngineStart() ? "Дистанционный запуск" : " Обычный запуск") +
                " Действие страховки - " + car.getInsurance().getInsuranceValidityPeriod() +
                " Стоимость страховки - " + car.getInsurance().getCostInsurance() + " руб. " +
                " Номер страхового полиса - " + car.getInsurance().getItrnsuranceNumber());
    }




}