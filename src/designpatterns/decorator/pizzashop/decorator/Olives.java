package designpatterns.decorator.pizzashop.decorator;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;

public class Olives extends Toppings {

    private BasePizza pizza;

    public Olives(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 10;
    }

}
