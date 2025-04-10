public class MenuItem{
    private String item;
    private double price;
    private String description;

    public MenuItem(){
        this.item = "";
        this.price = 0.0;
        this.description = "";
    }

    public MenuItem(String item, double price, String description) {
        this.item = item;
        this.price = price;
        this.description = description;
    }

    public String getItem(){
        return item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}