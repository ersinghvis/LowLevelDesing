package designpatterns.strategypattern.paymentsystem;

public class DebitCardPaymentGateway extends PaymentGateway{

    public DebitCardPaymentGateway(){
        super(new CardPaymentStrategy());
    }

}
