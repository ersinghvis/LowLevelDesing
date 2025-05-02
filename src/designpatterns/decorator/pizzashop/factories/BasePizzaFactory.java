package designpatterns.decorator.pizzashop.factories;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;
import designpatterns.decorator.pizzashop.abstracts.Farmhouse;
import designpatterns.decorator.pizzashop.abstracts.Margherita;
import designpatterns.decorator.pizzashop.abstracts.PeppyPaneer;
import designpatterns.decorator.pizzashop.enums.PizzaType;

public class BasePizzaFactory {

    public static BasePizza getPizza(PizzaType pizzaType){
        if( pizzaType == PizzaType.FARMHOUSE ){
            return new Farmhouse();
        } else if (pizzaType == PizzaType.PEPPYPANEER) {
            return new PeppyPaneer();
        } else if (pizzaType == PizzaType.MARGHERITA) {
            return new Margherita();
        }else {
            return null;
        }
    }

}
