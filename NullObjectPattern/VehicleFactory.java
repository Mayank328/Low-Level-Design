package NullObjectPattern;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equals("Car")){
            return new Car();
        }
        return new NullVehicle();
    }
}