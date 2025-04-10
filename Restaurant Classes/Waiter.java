public class Waiter extends Employee {
    
    public Waiter() {
        super();
    }
    
    public Waiter(int employeeID, String password, String firstName, String lastName, double hoursWorked, double hourlyWage) {
        super(employeeID, password, firstName, lastName, hoursWorked, hourlyWage);
    }

    public void takeOrder(){
        // Logic to take an order from a customer
        System.out.println("Taking order...");
    }

    public void collectPayment(){
        // Logic to collect payment from a customer
        System.out.println("Collecting payment...");
    }
    
}