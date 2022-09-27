//ENUM
public enum OrderStatus {
    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);
    
    private int ordemStatus;

    
    private OrderStatus(int ordemStatus) {
        this.ordemStatus = ordemStatus;
    }
    
    public int getOrdemStatus() {
        return ordemStatus;
    }
    
    
}
