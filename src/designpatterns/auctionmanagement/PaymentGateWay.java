package designpatterns.auctionmanagement;

public abstract class PaymentGateWay {

    private IPaymentStrategy paymentStrategy;

    public PaymentGateWay(IPaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(){
        paymentStrategy.pay();
    }

}
