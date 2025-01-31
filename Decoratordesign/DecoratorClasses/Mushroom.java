package Decoratordesign.DecoratorClasses;

import Decoratordesign.BaseClasses.BasePizza;

public class Mushroom extends Toppings {
    private BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
    
}
