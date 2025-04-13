package Creational.FactoryDesignPattern;

public abstract class Car {

    public void startEngine(){
        System.out.println("Car engine started");
    }

    public void stopEngine(){
        System.out.println("Car engine stopped");
    }

    public abstract void mileage();
}
