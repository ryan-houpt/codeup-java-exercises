package products;

public class Product {

    protected double price;
    protected String description;
    protected String dateWhenAvail;

    public void order() {
        System.out.println("Ordering new products");
    }

    public void priceCall() {
        System.out.println(this.price);
    }

    public void description() {
        System.out.println(this.description);
    }

    public void setDateAvail(String input) {
        this.dateWhenAvail = input;
        System.out.println("This item is available : " + this.dateWhenAvail);
    }



}
