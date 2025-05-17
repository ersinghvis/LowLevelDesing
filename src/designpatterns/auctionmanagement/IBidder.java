package designpatterns.auctionmanagement;

public interface IBidder {

    public void getCurrentBid(IBidder bidder, int price);

    public void placeBid();

}
