package designpatterns.decorator.pizzashop.interfaces;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;

public interface IOrder {

    public int addPizza(BasePizza pizza, String size);

    public boolean placeOrder();

    public double getBill();

    public void addToppings(int pizzaId, String topping);

}
