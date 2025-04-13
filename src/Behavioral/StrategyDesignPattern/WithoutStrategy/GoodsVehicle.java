package Behavioral.StrategyDesignPattern.WithoutStrategy;

public class GoodsVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Goods Drive Capability");
    }
}
