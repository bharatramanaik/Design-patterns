package Abstractfactorydesign.Factory2;

import Abstractfactorydesign.AllVehicles.Mahindra;
import Abstractfactorydesign.AllVehicles.Tata;
import Abstractfactorydesign.AllVehicles.Vehicle;

public class OrdinaryVehicle implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String input) {
        switch (input) {
            case "tata": return new Tata();
            case "mahindra": return new Mahindra();
        
            default: return null;
        }
    }

    
}