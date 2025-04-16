import java.util.ArrayList;
public class Order{
    private int orderID;
    private double total;
    private boolean isDone;
    private ArrayList<MenuItemR> items = new ArrayList<>();

    public Order(){
        this.orderID = 000000;
        this.total = 0.0;
        this.isDone = false;
    }

    public Order(int orderID, double total){
        this.orderID = orderID;
        this.total = total;
        this.isDone = false;
    }

    public int getOrderID(){
        return orderID;
    }

    public void setOrderID(int orderID){
        this.orderID = orderID;
    }

    public void addItems(MenuItemR item){
        items.add(item);
        total += item.getPrice();
    }

    public void getItems(){
        for(MenuItemR item : items){
            System.out.println(item.getItem() + " - $" + item.getPrice());
        }
    }

    public double getTotal(){
        return total;
    }

    public void completeOrder(){
        isDone = true;
    }
}