package Creational.FactoryDesignPattern;

/**
 * Factory Design Pattern
 * Factory Design Pattern is a creational design pattern that provides an interface
 * for creating objects in a superclass, but allows subclasses to alter the type of
 * objects that will be created.
 * In this example, we have a CarFactory class that creates different types of cars
 * based on the input parameter. The getCar method takes a String parameter carBrand
 * and returns an instance of the corresponding car class. If the carBrand is not
 * recognized, it returns a default car (Nano in this case).
 */
public class CarFactory {
    public static Car getCar(String carBrand) {
        switch (carBrand) {
            case "BMW":
                return new BMW();
            case "Benz":
                return new Benz();
            default:
                return new Nano();
        }
    }
}
