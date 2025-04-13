package Creational.BuilderDesignPattern;

/**
 * This class represents a Home object with various properties such as
 * number of bedrooms, bathrooms, kitchen type, and presence of a swimming pool.
 * It uses the Builder pattern to create instances of the Home class.
 */
public class Home {
    int bedRooms;
    int bathRooms;
    KitchenType kitchenType;
    boolean hasSwimmingPool;

    public Home(HomeBuilder homeBuilder) {
        this.bedRooms = homeBuilder.bedRooms;
        this.bathRooms = homeBuilder.bathRooms;
        this.kitchenType = homeBuilder.kitchenType;
        this.hasSwimmingPool = homeBuilder.hasSwimmingPool;
    }

    public String toString() {
        return "Home Sweet Home with {" +
                "bedRooms=" + bedRooms +
                ", bathRooms=" + bathRooms +
                ", kitchenType=" + kitchenType +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
