package Adapterdesign;

import Adapterdesign.Adaptee.WeighingMachineBabies;
import Adapterdesign.Adapter.WeighingMachineAdpater;
import Adapterdesign.Adapter.WeighingMachineAdpaterImpl;

public class Client {
    public static void main(String[] args) {
        WeighingMachineAdpater wMachineAdpater = new WeighingMachineAdpaterImpl(new WeighingMachineBabies());
        System.out.println(wMachineAdpater.getWeightAndConvertToKg());
    }
}
