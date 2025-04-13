package Creational.FactoryDesignPattern;

public class BenzCar extends Car{
    @Override
    public void startEngine() {
        System.out.println("Benz Car is started");
    }

    @Override
    public void mileage() {
        System.out.println("Mileage will be 12Km");
    }
}
