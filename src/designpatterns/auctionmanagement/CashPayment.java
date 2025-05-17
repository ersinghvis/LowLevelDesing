package designpatterns.auctionmanagement;

public class CashPayment implements  IPaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Cash Payment");
    }
}
