package AdapterPattern.Adaptee;

public class WeightMachineForBabies implements WeightMachine {

    @Override
    public double getWeightInPound(){
        return 10.0;
    }
}