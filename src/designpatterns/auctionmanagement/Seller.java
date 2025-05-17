package designpatterns.auctionmanagement;

public class Seller {

    public Seller(String name, Product product){
        this.name = name;
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private String name;

    private Product product;



}
