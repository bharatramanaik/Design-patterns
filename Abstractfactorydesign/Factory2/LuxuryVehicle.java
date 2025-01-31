package Abstractfactorydesign.Factory2;

import Abstractfactorydesign.AllVehicles.BMW;
import Abstractfactorydesign.AllVehicles.Mercedes;
import Abstractfactorydesign.AllVehicles.Vehicle;

public class LuxuryVehicle implements VehicleFactory{

    @Override
    public Vehicle getVehicle(String input) {
            switch (input) {
                case "mercedes": return new Mercedes();
                case "bmw": return new BMW();
            
                default:
                    return null;
            }
        
    }

    
}
