package Behavioral.StrategyDesignPattern.WithStrategy;

public class Demo {
    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();

        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
    }
}
