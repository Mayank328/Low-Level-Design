package withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle{

    @Override
    public void drive() {
        System.out.println("OffRoad drive capability");
    }
}