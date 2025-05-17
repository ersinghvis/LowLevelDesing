package designpatterns.auctionmanagement;

public class OnlinePayment implements  IPaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Online Payment");
    }
}
