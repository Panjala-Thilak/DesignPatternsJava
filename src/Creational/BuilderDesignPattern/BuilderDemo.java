package Creational.BuilderDesignPattern;

public class BuilderDemo {
    public static void main(String[] args) {
        Home home = new Home(new HomeBuilder()
                .setBedRooms(3).setBathRooms(2).hasSwimmingPool(true).setKitchen(KitchenType.MODERN).build());

        System.out.println(home.toString());
    }
}
