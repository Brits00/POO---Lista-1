
public class OrderItem {
    private Integer quantity;
    private double price;


    public OrderItem(int quantity, double productPrice, Product product) {
    }


    public Integer getQuantity() {
        return quantity;
    }

    public Integer setQuantity(Integer quantity) {
        return this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }


    public double setPrice(double price) {
        return this.price = price;
    }

}
