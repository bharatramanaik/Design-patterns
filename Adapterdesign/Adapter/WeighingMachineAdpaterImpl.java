package Adapterdesign.Adapter;

import Adapterdesign.Adaptee.WeighingMachine;

public class WeighingMachineAdpaterImpl implements WeighingMachineAdpater{

    private WeighingMachine weighingMachine;
    public WeighingMachineAdpaterImpl(WeighingMachine weighingMachine){
        this.weighingMachine = weighingMachine;
    }

    @Override
    public double getWeightAndConvertToKg() {
        double weight = weighingMachine.checkWeight() * 0.45;
        return weight;

    }
    
}
