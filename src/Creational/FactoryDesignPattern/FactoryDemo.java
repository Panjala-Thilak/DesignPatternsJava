package Creational.FactoryDesignPattern;

/**
 * FactoryDemo class is the main entry point of the program.
 * It demonstrates the usage of the CarFactory class to create instances of different car types.
 *
 */
public class FactoryDemo {
    public static void main(String args[]) {
        Car car = CarFactory.getCar("Benz");
        car.startEngine();
        car.mileage();
    }
}
