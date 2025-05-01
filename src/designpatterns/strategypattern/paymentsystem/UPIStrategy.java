package designpatterns.strategypattern.paymentsystem;

public class UPIStrategy implements IPaymentGatewayStrategy{
    @Override
    public void pay() {
        System.out.println("Upi payment method called");
    }
}
