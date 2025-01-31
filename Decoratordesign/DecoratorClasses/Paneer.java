package Decoratordesign.DecoratorClasses;

import Decoratordesign.BaseClasses.BasePizza;

public class Paneer extends Toppings {
    private BasePizza basePizza;

    public Paneer(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 25;
    }
    
}
