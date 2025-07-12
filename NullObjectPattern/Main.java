package NullObjectPattern;

public class Main {
    
    public static void main(String[] args){
        VehicleFactory vf = new VehicleFactory();
        Vehicle car = vf.getVehicle("Car");
        System.out.println("Car Fuel: " + car.getfuel());
        System.out.println("Car Seats: " + car.getseat());
    }
}