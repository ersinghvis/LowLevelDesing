package designpatterns.auctionmanagement;

import java.util.ArrayList;
import java.util.List;

public class AuctionSystem {

    public int getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(int currentBid) {
        this.currentBid = currentBid;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public IBidder getOwningBidder() {
        return owningBidder;
    }

    public void setOwningBidder(IBidder owningBidder) {
        this.owningBidder = owningBidder;
    }

    private int currentBid;

    private Seller seller;

    private IBidder owningBidder;

    private List<IBidder> bidderList;

    public AuctionSystem(Seller seller){
        this.bidderList = new ArrayList<>();
        this.seller = seller;
        this.currentBid = seller.getProduct().getPrice();
    }

    public void addBidder(IBidder bidder){
        bidderList.add(bidder);
    }

    public void placeBid(IBidder bidder, int price ){
        if( price < currentBid ){
            return;
        }
        owningBidder = bidder;
        this.currentBid = price;
        bidderList.forEach( b -> b.getCurrentBid(bidder, price) );
    }

}
