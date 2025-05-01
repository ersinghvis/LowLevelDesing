package designpatterns.decorator.pizzashop.abstracts;

public class Margherita extends BasePizza{
    @Override
    public double cost() {
        return 100;
    }
}
