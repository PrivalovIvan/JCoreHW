public class Product {
    private String title;
    private double priceStandart;
    private double priceDiscount;
    private String category;
    private Integer percent;

    public Integer getPercent() {
        return percent;
    }

    public Product(Integer percent) {
        this.percent = percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public String getCategory() {
        return category;
    }

    public Product() {
    }

    public Product(String title, double priceStandart, double priceDiscount, String category, Integer percent) {
        this.title = title;
        this.priceStandart = priceStandart;
        this.priceDiscount = priceDiscount;
        this.category = category;
        this.percent = percent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return getTitle() + "\nStandart price product: " + getPriceStandart();
    }
    // public String toString() {
    // return getTitle() + "\nStandart price product: " + getPriceStandart() +
    // "\nDiscount: " + getPercent()
    // + "\nPrice discount: "
    // + getPriceDiscount();
    // }

    public double getPriceStandart() {
        return priceStandart;
    }

    public void setPriceStandart(double priceStandart) {
        this.priceStandart = priceStandart;
    }

    public double getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(double priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

}
