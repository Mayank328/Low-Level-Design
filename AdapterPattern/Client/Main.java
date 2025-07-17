package AdapterPattern.Client;

import AdapterPattern.Adapter.WeightMachineAdapter;
import AdapterPattern.Adapter.WeightMachineAdapterImpl;
import AdapterPattern.Adaptee.WeightMachineForBabies;

public class Main {

    public static void main(String args[]) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg() + " kg");

    }
}

