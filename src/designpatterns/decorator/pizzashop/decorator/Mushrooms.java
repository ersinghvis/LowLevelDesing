package designpatterns.decorator.pizzashop.decorator;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;

public class Mushrooms extends Toppings{

    private BasePizza pizza;

    public Mushrooms(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 25;
    }

}
