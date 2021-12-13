public class Customer {
    public final String customerName;
    public double customerBalance;

    public Customer(String customerName, int balance) {
        this.customerName = customerName;
        this.customerBalance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }
}
