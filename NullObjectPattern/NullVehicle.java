package NullObjectPattern;

public class NullVehicle implements Vehicle {
    
    @Override
    public int getfuel() {return 0;}

    @Override
    public int getseat() {return 0;}
}