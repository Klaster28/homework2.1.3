import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada ", "Granta", 1.7, "Желтый", 2015, "Россия","Автоматическая", "Хетчбек", "п232пп23", "5", "Зимние");
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия","Механика","","","","");
        Car bmw = new Car("BMW ", "Z8", 3.0, "Черный", 2021, "Германия","","","","","");
        Car kia = new Car("KIA ", "Sportage 4 ", 2.4, "Красный", 2018, "Южная Корея","","","","","");
        Car hundai = new Car("Hundai ", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея","","","","","");

        printInfo(ladaGranta);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hundai);

    }
    private static void printInfo(Car car) {
        System.out.println("Автомобиль: " + car.getBrand() + " " + car.getModel() +
                ". Двигатель - " + car.getEngineVolume() + " л. Цвет кузова - " + car.getColor() +
                ". Год выпуска - " + car.getProductionYear() + ". Страна производства - " +
                car.getProductionCountry() + ". Тип трансмиссии - " + car.getTransmission() +
                ". Тип кузова - " + car.getBodyType() + ". Регистрационный номер - " + car.getRegistrationNumber() +
                ". Количество мест - " + car.getNumberSeats() + ". Шины - " + car.getTireIndication() + ". ");
    }



}