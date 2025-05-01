package designpatterns.strategypattern.paymentsystem;

public class UPIPaymentGateway extends PaymentGateway{

    public UPIPaymentGateway(){
        super(new UPIStrategy());
    }

}
