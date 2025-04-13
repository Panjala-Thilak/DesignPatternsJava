package Behavioral.StrategyDesignPattern.WithStrategy;


import Behavioral.StrategyDesignPattern.WithStrategy.Strategy.GoodsDriveStrategy;

public class GoodsVehicle extends Vehicle {

    public GoodsVehicle() {
        super(new GoodsDriveStrategy());
    }
}
