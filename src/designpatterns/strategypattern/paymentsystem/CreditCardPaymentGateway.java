package designpatterns.strategypattern.paymentsystem;

public class CreditCardPaymentGateway extends PaymentGateway{
    public CreditCardPaymentGateway() {
        super(new CardPaymentStrategy());
    }
}
