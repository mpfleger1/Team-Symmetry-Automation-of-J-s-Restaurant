public class Employee{
    private int employeeID;
    private String password;
    private String firstName;
    private String lastName;
    private double hoursWorked;
    private double hourlyWage;

    public Employee(){
        this.employeeID = 000000;
        this.password = "password1";
        this.firstName = "John";
        this.lastName = "Smith";
        this.hoursWorked = 0.0;
        this.hourlyWage = 7.25;
    }

    public Employee(int employeeID, String password, String firstName, String lastName, double hoursWorked, double hourlyWage){
        this.employeeID = employeeID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    public boolean login(){
        // Placeholder for login logic
        // In a real application, this would check the password against a database or other secure storage
        return true;
    }

    public int getEmployeeID(){
        return employeeID;
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