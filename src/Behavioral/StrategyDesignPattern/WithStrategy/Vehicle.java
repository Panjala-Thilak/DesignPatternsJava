package Behavioral.StrategyDesignPattern.WithStrategy;

import Behavioral.StrategyDesignPattern.WithStrategy.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
