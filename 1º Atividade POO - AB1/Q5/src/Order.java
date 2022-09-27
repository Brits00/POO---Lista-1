import java.util.Date;

public class Order {
    private Date moment;
    private OrderStatus status;

    public Order(OrderStatus status) {
    }

    public Order(Date moment){
    }

    public void addItem(OrderItem item) {
    }

    public void removeItem(OrderItem item){
    }

    public double total(){
        return 0;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }


    public OrderStatus getStatus() {
        return status;
    }


    public void setStatus(OrderStatus status) {
        this.status = status;
    }

}
