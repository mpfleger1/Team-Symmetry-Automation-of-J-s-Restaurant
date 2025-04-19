public class Restaurant {
    private String name;
    private String location;
    private String website;
    private final int restaurantID;
    private final int[][] tables;

    public Restaurant(){
        this.name = "J's Corner Restaurant";
        this.location = "680 Arntson Dr., Marietta, GA 30060";
        this.website = "https://www.jscorner.com";
        this.restaurantID = 12345678;
        this.tables = new int[6][6];
    }

    public Restaurant(String name, String location, String website, int restaurantID, int[][] tables){
        this.name = name;
        this.location = location;
        this.website = website;
        this.restaurantID = restaurantID;
        this.tables = tables;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public String getWebsite(){
        return website;
    }

    public int getRestaurantID(){
        return restaurantID;
    }

    public int[][] getTables(){
        return tables;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setWebsite(String website){
        this.website = website;
    }
}