public class Customer {
    private String name;
    private static int customerId = 1000;
    private static int customerCount = 0;
    

    public Customer(String name) {
        this.name = name;
        this.customerCount++;
        this.customerId++;
    }

    public String getName() {
        return name;
    }

    public static int getCustomerCount() {
        return customerCount;
    }

    public static int getCustomerId() {
        return customerId;
    }
}