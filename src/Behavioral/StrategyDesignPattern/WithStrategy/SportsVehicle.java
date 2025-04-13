package Behavioral.StrategyDesignPattern.WithStrategy;

import Behavioral.StrategyDesignPattern.WithStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
