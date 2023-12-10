package rodriguez.ciro.drools.model;

public class Order {
    private String name;
    private String cardType;
    private double discount;
    private double price;

    public Order() {
    }

    public Order(String name, String cardType, int discount, int price) {
        this.name = name;
        this.cardType = cardType;
        this.discount = discount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
