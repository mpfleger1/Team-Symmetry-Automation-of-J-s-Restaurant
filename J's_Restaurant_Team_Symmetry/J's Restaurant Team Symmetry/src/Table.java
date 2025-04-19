public class Table{
    private int tableID;
    private String status;

    public Table(){
        this.tableID = 0;
        this.status = "Clean";
    }

    public Table(int tableID, String status){
        this.tableID = tableID;
        this.status = status;
    }

    public void clear(){
        this.status = "Clean";
    }
    
    public int getTableID(){
        return tableID;
    }

    public void setTableID(int tableID){
        this.tableID = tableID;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}