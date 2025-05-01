package designpatterns.strategypattern.paymentsystem;

public class PaymentGateway {

    private IPaymentGatewayStrategy paymentGatewayStrategy;

    public PaymentGateway(IPaymentGatewayStrategy paymentGatewayStrategy){
        this.paymentGatewayStrategy = paymentGatewayStrategy;
    }

    public void pay(){
        paymentGatewayStrategy.pay();
    }

}
