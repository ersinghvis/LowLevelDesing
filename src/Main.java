import designpatterns.auctionmanagement.*;

class Main {

    public static void main(String[] args) {

        Product p = new Product("Book", 100);

        Seller seller = new Seller("Vishal", p);

        AuctionSystem auctionSystem = new AuctionSystem(seller);

        IBidder bidder1 = new Bidder(auctionSystem, "Vipul");
        IBidder bidder2 = new Bidder(auctionSystem, "Vim");

        auctionSystem.addBidder( bidder1);

        auctionSystem.addBidder(  bidder2 );

        bidder1.placeBid();
        bidder2.placeBid();

        System.out.println("Highest bid placed by " + ((Bidder)auctionSystem.getOwningBidder()).getName() + " is: " + auctionSystem.getCurrentBid() );

    }
}