public class Order {
    private Product product;
    private Customer customer;
    private Integer qty;
    private Double price;
    private double priceDiscount;
    private Integer discount;

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public double getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Order() {
    }

    public Order(Product product, Customer customer, Integer qty, Double price,
            double priceDiscount, Integer discount) {
        this.product = product;
        this.customer = customer;
        this.qty = qty;
        this.price = price;
        this.priceDiscount = priceDiscount;
        this.discount = discount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "\n" + getCustomer().getFirstName() + " buy: " + getProduct().getTitle() + " - " + getQty()
                + " psc.\nStandart price product: " + getProduct().getPriceStandart() +
                "\nDiscount: " + getDiscount() + "\nPrice discount: " + getPriceDiscount() + "\nAmount order: "
                + getPrice() + "\n-------------------------------";
    }

}
