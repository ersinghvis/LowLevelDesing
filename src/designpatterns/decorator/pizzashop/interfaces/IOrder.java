package designpatterns.decorator.pizzashop.interfaces;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;
import designpatterns.decorator.pizzashop.enums.ToppingType;

public interface IOrder {

    public int addPizza(BasePizza pizza, String size);

    public boolean placeOrder();

    public double getBill();

    public void addToppings(int pizzaId, ToppingType topping);

}
