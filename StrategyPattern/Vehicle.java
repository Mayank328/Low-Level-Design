package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveObject;

    //This contructor injection
    public Vehicle(DriveStrategy driveObj){

        this.driveObject = driveObj;
    }

    public void drive(){

        driveObject.drive();
    }
}