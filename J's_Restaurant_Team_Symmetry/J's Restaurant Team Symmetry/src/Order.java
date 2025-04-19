import java.util.*;

public class Order {
    
    private int orderId;
    private ArrayList<MenuItem> items;
    private double totalPrice;
    private String status; // "Pending", "In Progress", "Completed", etc.

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        this.status = "Pending";
    }

    public int getOrderId() {
        return orderId;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    public void removeItem(MenuItem item) {
        if (items.remove(item)) {
            totalPrice -= item.getPrice();
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void clearOrder() {
        items.clear();
        totalPrice = 0.0;
        status = "Pending";
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order ID: " + orderId + "\n");
        orderDetails.append("Status: ").append(status).append("\n");
        orderDetails.append("Items:\n");
        for (MenuItem item : items) {
            orderDetails.append(item.getName()).append(" - $").append(item.getPrice()).append("\n");
        }
        orderDetails.append("Total Price: $").append(totalPrice).append("\n");
        return orderDetails.toString();
    }
}