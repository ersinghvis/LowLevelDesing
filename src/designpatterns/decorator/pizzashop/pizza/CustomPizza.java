package designpatterns.decorator.pizzashop.pizza;

import designpatterns.decorator.pizzashop.abstracts.BasePizza;

import java.util.List;

public class CustomPizza {

    private String size;

    private long pizzaId;

    private List<String> toppings;

    private BasePizza basePizza;

    public long getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(long pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public BasePizza getBasePizza() {
        return basePizza;
    }

    public void setBasePizza(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
