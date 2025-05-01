package designpatterns.decorator.pizzashop.decorator;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;

public class Jalapenos  extends Toppings{

    private BasePizza pizza;

    public Jalapenos(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 15;
    }

}
