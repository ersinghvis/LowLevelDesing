package designpatterns.decorator.pizzashop.utils;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;
import designpatterns.decorator.pizzashop.constants.PizzaConstants;
import designpatterns.decorator.pizzashop.decorator.ExtraCheese;
import designpatterns.decorator.pizzashop.decorator.Jalapenos;
import designpatterns.decorator.pizzashop.decorator.Mushrooms;
import designpatterns.decorator.pizzashop.decorator.Olives;
import designpatterns.decorator.pizzashop.pizza.CustomPizza;

import java.util.List;

public class PizzaUtils {

    public double calculateOrderPrice(List<CustomPizza> pizzas){
        double cost = 0;
        if( pizzas.size() == 0 ){
            return 0;
        }else{
            for (CustomPizza pizza : pizzas){
                cost += calculatePizzaPrice(pizza);
            }
        }
        return cost;
    }

    private double calculatePizzaPrice(CustomPizza pizza){
        double cost = 0;
        cost +=  getPizzaCostPerSize(pizza.getSize());
        cost += getPizzaCostWithToppings(pizza);
        return cost;
    }

    private double getPizzaCostWithToppings(CustomPizza pizza){
        BasePizza currPizza = pizza.getBasePizza();
        for(String topping : pizza.getToppings()){
            if( PizzaConstants.TOPPING_EXTRA_CHEESE.equals(topping) ){
                currPizza = new ExtraCheese(currPizza);
            }else if( PizzaConstants.TOPPING_JALAPENOS.equals(topping) ){
                currPizza = new Jalapenos(currPizza);
            }else if( PizzaConstants.TOPPING_MUSHROOMS.equals(topping)){
                currPizza = new Mushrooms(currPizza);
            } else if (PizzaConstants.TOPPING_OLIVES.equals(topping)) {
                currPizza = new Olives(currPizza);
            }
        }
        return currPizza.cost();
    }

    private double getPizzaCostPerSize(String size){
        if( "medium".equalsIgnoreCase(size) ){
            return PizzaConstants.MEDIUM_SIZE_COST;
        } else if ("big".equalsIgnoreCase(size)) {
            return PizzaConstants.BIG_SIZE_COST;
        }
        return PizzaConstants.SMALL_SIZE_COST;
    }

}
