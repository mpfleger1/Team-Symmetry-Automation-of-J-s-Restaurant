public class Customer{
    private int customerID;
    private boolean paymentMethod;//true = card / false = cash

    public Customer(){
        this.customerID = 000000;
        this.paymentMethod = true;
    }
    public Customer(int customerID, boolean paymentMethod){
        this.customerID = customerID;
        this.paymentMethod = paymentMethod;
    }

    public int getCustomerID(){
        return customerID;
    }

    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }

    public boolean isPaymentMethod(){
        return paymentMethod;
    }

    public void setPaymentMethod(boolean paymentMethod){
        this.paymentMethod = paymentMethod;
    }
}