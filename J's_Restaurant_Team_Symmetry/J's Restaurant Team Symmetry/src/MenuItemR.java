public class MenuItemR {

    String name;
    String priceMult; //created a string price for deals where multiple items can be sold for one price. ie "2 for $1"
    String description;
    float price;

    //constructor for appetizers, salads, entrees, sandwiches, and burgers
    MenuItemR(String name, String price, String description){
        this.name = name;
        this.priceMult = price;
        this.description = description;

    }

    //constructor for appetizers, salads, entrees, sandwiches, and burgers
    MenuItemR(String name, float price, String description){
        this.name = name;
        this.price = price;
        this.description = description;

    }

    //constructor for sides and drinks
    MenuItemR(String name, float price){
        this.name = name;
        this.price = price;
    }


    //getters and setters


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public String getPriceMult() {
        return priceMult;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPriceMult(String priceMult) {
        this.priceMult = priceMult;
    }

    //overriding to string so that it will print out the name, price, and optional description
    @Override
    public String toString(){
        if(this.description != null){
            if(this.priceMult == null){
                return this.name+ " - $"+String.format("%.2f",this.price)+"\n\t"+this.description;
            }else{
                return this.name+ " - "+this.priceMult+"\n\t"+this.description;

            }
        }else {
            return this.name+ " - $"+String.format("%.2f",this.price);

        }
    }


}
