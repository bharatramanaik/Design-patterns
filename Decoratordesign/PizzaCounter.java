package Decoratordesign;

import Decoratordesign.BaseClasses.Farmhouse;
import Decoratordesign.DecoratorClasses.Extracheese;
import Decoratordesign.DecoratorClasses.Paneer;

public class PizzaCounter {
    public static void main(String[] args) {
        Farmhouse farmhouse = new Farmhouse();
        Paneer paneerFarmhouse = new Paneer(farmhouse);
        Extracheese extracheesePaneerFarm = new Extracheese(paneerFarmhouse);
        System.out.println(extracheesePaneerFarm.cost());
    }
}
