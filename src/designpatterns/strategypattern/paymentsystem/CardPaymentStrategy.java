package designpatterns.strategypattern.paymentsystem;

public class CardPaymentStrategy implements IPaymentGatewayStrategy{
    @Override
    public void pay() {
        System.out.println("Card payment method called");
    }
}
