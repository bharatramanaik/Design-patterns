package Decoratordesign.DecoratorClasses;

import Decoratordesign.BaseClasses.BasePizza;

public class Extracheese extends Toppings {

    private BasePizza basePizza;

    public Extracheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
    
}
