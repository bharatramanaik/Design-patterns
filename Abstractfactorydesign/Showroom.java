package Abstractfactorydesign;

import Abstractfactorydesign.AllVehicles.BMW;
import Abstractfactorydesign.AllVehicles.Vehicle;
import Abstractfactorydesign.Factory1.VehicleTypeFactory;
import Abstractfactorydesign.Factory2.LuxuryVehicle;
import Abstractfactorydesign.Factory2.OrdinaryVehicle;
import Abstractfactorydesign.Factory2.VehicleFactory;

public class Showroom {
    public static void main(String[] args) {
        VehicleTypeFactory vehicleTypeFactory = new VehicleTypeFactory();
        VehicleFactory luxuryVehicle = vehicleTypeFactory.getVehicleFactory("luxury");
        Vehicle bmw = luxuryVehicle.getVehicle("bmw");
        bmw.getOnroadPrice();
        VehicleFactory ordinaryVehicle = vehicleTypeFactory.getVehicleFactory("ordinary");
        Vehicle tata = ordinaryVehicle.getVehicle("tata");
        tata.getOnroadPrice();


    }
}
