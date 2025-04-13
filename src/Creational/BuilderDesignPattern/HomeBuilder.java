package Creational.BuilderDesignPattern;

/**
 * This class represents a builder for creating Home objects.
 * It provides a fluent interface for setting various properties of the Home object.
 * The build() method returns the constructed Home object.
 * The toString() method is overridden to provide a string representation of the Home object.
 */
public class HomeBuilder {
    int bedRooms;
    int bathRooms;
    KitchenType kitchenType;
    boolean hasSwimmingPool;

    public HomeBuilder setBedRooms(int bedRooms) {
        this.bedRooms = bedRooms;
        return this;
    }

    public HomeBuilder setBathRooms(int bathRooms) {
        this.bathRooms = bathRooms;
        return this;
    }

    public HomeBuilder setKitchen(KitchenType kitchenType) {
        this.kitchenType = kitchenType;
        return this;
    }

    public HomeBuilder hasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    public HomeBuilder build() {
        return this;
    }

    public String toString() {
        return "HomeBuilder{" +
                "bedRooms=" + bedRooms +
                ", bathRooms=" + bathRooms +
                ", kitchenType=" + kitchenType +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
