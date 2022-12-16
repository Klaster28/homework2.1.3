import transport.*;


public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada ", "Granta", 1.7, "Желтый", 2015, "Россия", 200, BodyOfType.SEDAN);
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", 168, BodyOfType.UNIVERSAL);
        Car bmw = new Car("BMW ", "Z8", 3.0, "Черный", 2021, "Германия", 210, BodyOfType.SUV);
        Car kia = new Car("KIA ", "Sportage 4 ", 2.4, "Красный", 2018, "Южная Корея", 199, BodyOfType.COUPE);
        Car hundai = new Car("Hundai ", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", 243, BodyOfType.CROSSOVER);



        Bus pazik = new Bus("Пазик", "4236",5.0, "Белый", 2019, "Россия", 120,CapacityBus.MEDIUM);
        Bus gazel = new Bus("Газель", "4236",3.0, "Желтый", 2012, "Россия", 130,CapacityBus.SMALL);
        Bus ural = new Bus("Урал", "434",6.5, "Зеленый", 2002, "Россия", 115,CapacityBus.LARGE);
        Bus ikarus = new Bus("Икарус", "535",5.5, "Синий", 2005, "Болгария", 125,CapacityBus.LARGE);

        Trucks kamaz = new Trucks("Камаз", "6544", 6.0,"Синий", 2020, "Россия", 110, WeightTruck.N1);
        Trucks maz = new Trucks("Маз", "687", 7.0,"Желтый", 2015, "Россия", 125, WeightTruck.N2);
        Trucks zil = new Trucks("Зил", "130", 5.0,"Красный", 2022, "Россия", 90, WeightTruck.N3);
        Trucks gaz = new Trucks("Газ", "53", 3.0,"Зеленый", 2000, "Россия", 90, WeightTruck.N3);

     //   DriverB ivan = new DriverB("Иванов Иван", 12, "B","Lada ", "Granta", 1.7, "Синий", 2015, "Россия",150);
     //   DriverC petr = new DriverC("Петров Петр", 15, "C","Камаз ", "6544", 7.0, "Желтый", 2011, "Россия",110);
     //   DriverD sidor = new DriverD("Сидоров Сидор", 20, "D","Пазик ", "4236", 5.0, "Красный", 2010, "Россия",115);

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
     //   printInfo(ivan);
     //   printInfo(petr);
     //   printInfo(sidor);



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
   /*     private static void printInfo(DriverB driverB) {
        System.out.println("Водитель - " + driverB.getNameDriver() + ". Имеет опыт - " + driverB.getExperienceDriver()+
                " лет и права управления категории - "+ driverB.getDriverLicence()+ ". Будет участвовать в заезде " +
                "на автомобиле - " + driverB.getBrand() + " " + driverB.getModel() +
                        ". Двигатель - " + driverB.getEngineVolume() + " л. Цвет кузова - " + driverB.getColor() +
                 ". Год выпуска - " + driverB.getProductionYear() + ". Страна производства - " +
                  driverB.getProductionCountry() + " . Максимальная скорость - " + driverB.getMaxSpeedTransport() +
                driverB.getBodyOfType());

    }
    private static void printInfo(DriverC driverC) {
        System.out.println("Водитель - " + driverC.getNameDriver() + ". Имеет опыт - " + driverC.getExperienceDriver()+
                " лет и права управления категории - "+ driverC.getDriverLicence()+ ". Будет участвовать в заезде " +
                "на автомобиле - " + driverC.getBrand() + " " + driverC.getModel() +
                ". Двигатель - " + driverC.getEngineVolume() + " л. Цвет кузова - " + driverC.getColor() +
                ". Год выпуска - " + driverC.getProductionYear() + ". Страна производства - " +
                driverC.getProductionCountry() + " . Максимальная скорость - " + driverC.getMaxSpeedTransport() + driverC.getWeightTruck());

    }
    private static void printInfo(DriverD driverD) {
        System.out.println("Водитель - " + driverD.getNameDriver() + ". Имеет опыт - " + driverD.getExperienceDriver()+
                " лет и права управления категории - "+ driverD.getDriverLicence()+ ". Будет участвовать в заезде " +
                "на автомобиле - " + driverD.getBrand() + " " + driverD.getModel() +
                ". Двигатель - " + driverD.getEngineVolume() + " л. Цвет кузова - " + driverD.getColor() +
                ". Год выпуска - " + driverD.getProductionYear() + ". Страна производства - " +
                driverD.getProductionCountry() + " . Максимальная скорость - " + driverD.getMaxSpeedTransport());

    }
*/

}