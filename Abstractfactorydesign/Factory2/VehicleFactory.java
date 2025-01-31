package Abstractfactorydesign.Factory2;

import Abstractfactorydesign.AllVehicles.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String input);
}
