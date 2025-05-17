package designpatterns.auctionmanagement;

public class Bidder implements IBidder{

    private String name;

    private AuctionSystem auctionSystem;

    public Bidder( AuctionSystem auctionSystem, String name ){
        this.auctionSystem = auctionSystem;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void getCurrentBid(IBidder bidder, int price) {
        if( this == bidder ){
            return;
        }
        System.out.println("Current bid placed by: " + ((Bidder)bidder).getName() + " is: " + price);
    }

    @Override
    public void placeBid() {
        int price = this.auctionSystem.getCurrentBid() + 10;
        this.auctionSystem.placeBid(this, price );
    }
}
