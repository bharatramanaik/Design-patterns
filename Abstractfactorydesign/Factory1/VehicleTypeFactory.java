package Abstractfactorydesign.Factory1;

import Abstractfactorydesign.Factory2.LuxuryVehicle;
import Abstractfactorydesign.Factory2.OrdinaryVehicle;
import Abstractfactorydesign.Factory2.VehicleFactory;

public class VehicleTypeFactory {
    public VehicleFactory getVehicleFactory(String input){
        switch (input) {
            case "luxury": return new LuxuryVehicle();
            case "ordinary": return new OrdinaryVehicle();
            default:
                return null;
        }
    } 
}
