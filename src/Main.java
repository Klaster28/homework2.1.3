import transport.*;
import transport.Mechanic;
import transport.Sponsor;
import transport.Competing;
import transport.driver.Driver;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Mechanic<Car> pavel= new Mechanic<>("Павел","Павлов","Фара");
        Mechanic<Trucks> oleg= new Mechanic<>("Олег","Олегов","Бампер");
        Mechanic<Bus> ivan= new Mechanic<>("Иван","Иванов","Колесо");
        Mechanic<Car> petr= new Mechanic<>("Петр","Петров","Шина");
        Sponsor<Car> romachka = new Sponsor("Ромашка", 100000);
        Sponsor<Car> landich = new Sponsor("Ландыш", 200000);
        Sponsor<Car> klever = new Sponsor("Клевер", 300000);
        Sponsor<Car> roza = new Sponsor("Роза", 400000);


        Car ladaGranta = new Car("Lada ", "Granta", 1.7, "Желтый", 2015, "Россия", 200, BodyOfType.SEDAN);
        Car.addDriver(new DriverB("Рома", "В", 10));
        Car.addMechanic(petr);
        Car.addMechanic(pavel);
        Car.addSponsor(landich);
        Car.addSponsor(romachka);


        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", 168, BodyOfType.UNIVERSAL);
        Car bmw = new Car("BMW ", "Z8", 3.0, "Черный", 2021, "Германия", 210, BodyOfType.SUV);
        Car kia = new Car("KIA ", "Sportage 4 ", 2.4, "Красный", 2018, "Южная Корея", 199, BodyOfType.COUPE);
        Car hundai = new Car("Hundai ", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", 243, BodyOfType.CROSSOVER);



        Bus pazik = new Bus("Пазик", "4236",5.0, "Белый", 2019, "Россия", 120,CapacityBus.MEDIUM);
        Bus.addDriver(new DriverD("Семен", "D",11));
        Bus.addMechanic(ivan);
        Bus.addSponsor(roza);



        Bus gazel = new Bus("Газель", "4236",3.0, "Желтый", 2012, "Россия", 130,CapacityBus.SMALL);
        Bus ural = new Bus("Урал", "434",6.5, "Зеленый", 2002, "Россия", 115,CapacityBus.LARGE);
        Bus ikarus = new Bus("Икарус", "535",5.5, "Синий", 2005, "Болгария", 125,CapacityBus.LARGE);

        Trucks kamaz = new Trucks("Камаз", "6544", 6.0,"Синий", 2020, "Россия", 110, WeightTruck.N1);
        Trucks.addDriver(new DriverC("Вася","C", 12));
        Trucks.addMechanic(oleg);
        Trucks.addSponsor(landich);
        Trucks.addSponsor(klever);


        Trucks maz = new Trucks("Маз", "687", 7.0,"Желтый", 2015, "Россия", 125, WeightTruck.N2);
        Trucks zil = new Trucks("Зил", "130", 5.0,"Красный", 2022, "Россия", 90, WeightTruck.N3);
        Trucks gaz = new Trucks("Газ", "53", 3.0,"Зеленый", 2000, "Россия", 90, WeightTruck.N3);

        DriverD semen = new DriverD("Семен", "D",11);
        DriverC vasi = new DriverC("Вася","C", 12);
        DriverB roma = new DriverB("Рома", "В", 10);


        printInfo(ladaGranta);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hundai);

       System.out.println();
        printInfo(gazel);
        gazel.printType();
        printInfo(ural);
        ural.printType();
        printInfo(pazik);
        pazik.printType();
        printInfo(ikarus);
        ikarus.printType();

        System.out.println();
        printInfo(kamaz);
        kamaz.printType();
        printInfo(maz);
        maz.printType();
        printInfo(zil);
        zil.printType();
        printInfo(gaz);
        gaz.printType();

        System.out.println();
        printInfo(semen);
        printInfo(roma);
        printInfo(vasi);

        List <Transport> transport = List.of();

    }
private static void printInfo(Transport transport){
    System.out.println("Информация по автомобилю " + transport.getBrand() + transport.getModel());
    System.out.println("Водители" + transport.get);
    if(Driver<?> driver : transport.getDriver()) {
        System.out.println(driver.getName);
    }
}



    private static void printInfo(Car car) {
        System.out.println("Автомобиль: " + car.getBrand() + " " + car.getModel() +
                ". Двигатель - " + car.getEngineVolume() + " л. Цвет кузова - " + car.getColor() +
                ". Год выпуска - " + car.getProductionYear() + ". Страна производства - " +
                car.getProductionCountry()  + ". Максимальная скорость - " + car.getMaxSpeedTransport() + " км/ч. " +
                "Тип кузова автомобиля - " + car.getBodyOfType() + ".");
    }


    private static void printInfo(Bus bus) {
        System.out.println("Автобус: " + bus.getBrand() + " " + bus.getModel() +
                ". Двигатель - " + bus.getEngineVolume()+
                " Цвет кузова - " + bus.getColor() +
                ". Год выпуска - " + bus.getProductionYear() + ". Страна производства - " + bus.getProductionCountry() +
                ". Максимальная скорость - " +  bus.getMaxSpeedTransport() +" км/ч. Пассажировместимость автобуса - "
                + bus.getCapacityBus());
    }
    private static void printInfo(Trucks trucks) {
        System.out.println("Грузовик: " + trucks.getBrand() + " " + trucks.getModel() +". Двигатель - " + trucks.getEngineVolume()
                +" Цвет кузова - " + trucks.getColor() + ". Год выпуска - " + trucks.getProductionYear() + ". Страна производства - " +
                trucks.getProductionCountry() + " . Максимальная скорость - " + trucks.getMaxSpeedTransport() + " км/ч. Грузоподъемность автомобиля - "
                + trucks.getWeightTruck());
    }
       private static void printInfo(DriverB driverB) {
        System.out.println("Водитель - " + driverB.getNameDriver() + ". Имеет опыт - " + driverB.getExperienceDriver()+
                " лет и права управления категории - "+ driverB.getDriverLicence());

    }
    private static void printInfo(DriverC driverC) {
        System.out.println("Водитель - " + driverC.getNameDriver() + ". Имеет опыт - " + driverC.getExperienceDriver()+
                " лет и права управления категории - "+ driverC.getDriverLicence());

    }
    private static void printInfo(DriverD driverD) {
        System.out.println("Водитель - " + driverD.getNameDriver() + ". Имеет опыт - " + driverD.getExperienceDriver()+
                " лет и права управления категории - "+ driverD.getDriverLicence());

    }


}