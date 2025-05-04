package designpatterns.decorator.pizzashop.impl;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;
import designpatterns.decorator.pizzashop.enums.ToppingType;
import designpatterns.decorator.pizzashop.interfaces.IOrder;
import designpatterns.decorator.pizzashop.pizza.CustomPizza;
import designpatterns.decorator.pizzashop.utils.PizzaUtils;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrder {

    private int idCounter;

    private boolean isOrderPlaced;

    private PizzaUtils pizzaUtils;


    private List<CustomPizza> pizzas;

    public Order(){
        this.pizzas = new ArrayList<>();
        this.idCounter = 0;
        this.pizzaUtils = new PizzaUtils();
    }

    @Override
    public int addPizza(BasePizza pizza, String size) {
        CustomPizza newPizza = new CustomPizza();
        newPizza.setBasePizza(pizza);
        newPizza.setSize(size);
        newPizza.setPizzaId(idCounter++);
        newPizza.setToppings(new ArrayList<>());
        pizzas.add(newPizza);
        return idCounter - 1;
    }

    @Override
    public boolean placeOrder() {
        this.isOrderPlaced = true;
        return true;
    }

    @Override
    public double getBill() {
        if( isOrderPlaced ){
            return pizzaUtils.calculateOrderPrice(pizzas);
        }else{
            return 0;
        }
    }

    @Override
    public void addToppings(int pizzaId, ToppingType topping) {
        if( pizzaId >= pizzas.size() ){
            System.out.println("Invalid Pizza");
            return;
        }else{
            CustomPizza pizza = pizzas.get(pizzaId);
            pizza.getToppings().add(topping);
        }
    }
}
