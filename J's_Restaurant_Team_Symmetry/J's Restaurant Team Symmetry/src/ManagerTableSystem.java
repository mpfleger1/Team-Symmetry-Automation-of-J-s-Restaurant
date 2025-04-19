public class TableSystem {
    private String tableID;
    private int seats;
    private String assignedwaiter;

    public TableSystem(String tableID, int seats) {
        this.tableID = tableID;
        this.seats = seats;
        this.assignedwaiter = assignedwaiter;
    }

    public String gettableID() {
        return tableID;
    }

    public int seats() {
        return seats;
    }

    public String assignedwaiter() {
        return assignedwaiter;
    }

    //add seats
    public void addseats(int newseats) {
        this.seats = this.seats + newseats;
    }

    public void assignwaiter(String waiter) {
        this.assignedwaiter = waiter;
    }

    public String toString() {
        return "Table " + tableID + " has " + seats + " seats and is assigned to " + assignedwaiter;
    }

    public int getSeats() {
        return seats;
    }

    public void remove(TableSystem table1) {
    }
}
