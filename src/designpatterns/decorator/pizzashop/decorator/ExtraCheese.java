package designpatterns.decorator.pizzashop.decorator;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;
import designpatterns.observer.Publisher;

public class ExtraCheese extends Toppings{

    private BasePizza pizza;

    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 20;
    }
}
