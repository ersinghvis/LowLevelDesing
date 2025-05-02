package designpatterns.decorator.pizzashop.factories;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;
import designpatterns.decorator.pizzashop.abstracts.Farmhouse;
import designpatterns.decorator.pizzashop.abstracts.Margherita;
import designpatterns.decorator.pizzashop.abstracts.PeppyPaneer;
import designpatterns.decorator.pizzashop.decorator.ExtraCheese;
import designpatterns.decorator.pizzashop.decorator.Jalapenos;
import designpatterns.decorator.pizzashop.decorator.Mushrooms;
import designpatterns.decorator.pizzashop.decorator.Olives;
import designpatterns.decorator.pizzashop.enums.PizzaType;
import designpatterns.decorator.pizzashop.enums.ToppingType;

public class ToppingFactory {

    public static BasePizza getPizzaToppings(ToppingType toppingType, BasePizza pizza){
        if( toppingType == ToppingType.EXTRA_CHEESE ){
            return new ExtraCheese(pizza);
        } else if (toppingType == ToppingType.JALAPENOS) {
            return new Jalapenos(pizza);
        } else if (toppingType == ToppingType.MUSHROOMS) {
            return new Mushrooms(pizza);
        } else if (toppingType == ToppingType.OLIVES) {
            return new Olives(pizza);
        } else {
            return null;
        }
    }

}
