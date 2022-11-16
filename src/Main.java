public class Main {
    public static void main(String[] args) {

        Car ladaGranta = new Car("Lada ", "Granta", 1.7, "Желтый", 2015, "Россия");
        System.out.println("Автомобиль: " + ladaGranta.getBrand() + " " + ladaGranta.getModel() + ". Двигатель - " + ladaGranta.engineVolume+ " л. Цвет кузова - " + ladaGranta.getColor()+ ". Год выпуска - " + ladaGranta.getProductionYear() + ". Страна производства - "+ ladaGranta.getProductionCountry()+ ".");
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        System.out.println("Автомобиль: " + audi.getBrand() + " " + audi.getModel() + ". Двигатель - " + audi.engineVolume+ " л. Цвет кузова - " + audi.getColor()+ ". Год выпуска - " + audi.getProductionYear() + ". Страна производства - "+ audi.getProductionCountry()+ ".");
        Car bmw = new Car("BMW ", "Z8", 3.0, "Черный", 2021, "Германия");
        System.out.println("Автомобиль: " + bmw.getBrand() + " " + bmw.getModel() + ". Двигатель - " + bmw.engineVolume+ " л. Цвет кузова - " + bmw.getColor()+ ". Год выпуска - " + bmw.getProductionYear() + ". Страна производства - "+ bmw.getProductionCountry()+ ".");
        Car kia = new Car("KIA ", "Sportage 4 ", 2.4, "Красный", 2018, "Южная Корея");
        System.out.println("Автомобиль: " + kia.getBrand() + " " + kia.getModel() + ". Двигатель - " + kia.engineVolume+ " л. Цвет кузова - " + kia.getColor()+ ". Год выпуска - " + kia.getProductionYear() + ". Страна производства - "+ kia.getProductionCountry()+ ".");
        Car hundai = new Car("Hundai ", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        System.out.println("Автомобиль: " + hundai.getBrand() + " " + hundai.getModel() + ". Двигатель - " + hundai.engineVolume+ " л. Цвет кузова - " + hundai.getColor()+ ". Год выпуска - " + hundai.getProductionYear() + ". Страна производства - "+ hundai.getProductionCountry()+ ".");

    }
}