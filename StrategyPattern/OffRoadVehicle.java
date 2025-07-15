package StrategyPattern;

import StrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle (){
        
        super( new SportsDriveStrategy());
    }
}