public class Customer {
    private String name;
    private int customerId;
    private static int customerCount;
    private String customerType;

    public Customer(String name) {
        this.name = name;
        customerCount++;
    }

    public String getName() {
        return name;
    }

    public int getCustomerCount() {
        return customerCount;
    }

    public String getCustomerType() {
        return "Standard";
    }

    public int getCustomerId() {
        return customerId;
    }
}