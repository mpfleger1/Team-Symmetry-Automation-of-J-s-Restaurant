public class Employee{
    private int employeeID;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private double hoursWorked;
    private double hourlyWage;

    public Employee(){
        this.employeeID = 0;
        this.username = "jsmith";
        this.password = "password1";
        this.firstName = "John";
        this.lastName = "Smith";
        this.hoursWorked = 0.0;
        this.hourlyWage = 7.25;
    }

    public Employee(int employeeID, String username, String password, String firstName, String lastName){
        this.employeeID = employeeID;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getHoursWorked(){
        return hoursWorked;
    }
    
    public double getHourlyWage(){
        return hourlyWage;
    }

    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setHoursWorked(double hoursWorked){
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage;
    }


}