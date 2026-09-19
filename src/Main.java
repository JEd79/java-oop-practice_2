public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("John");
        System.out.println(c1.getCustomerCount());
        Customer c2 = new Customer("Jane");
        System.out.println(c1.getName());
        
        System.out.println(c2.getCustomerCount());

        System.out.println(c1.getCustomerId());
        System.out.println(c2.getCustomerId());

        PremiumCustomer c3 = new PremiumCustomer("Jason", 0.15);

        System.out.println(c1.getCustomerType());
        System.out.println(c3.getCustomerType());

        System.out.println(c1.getCustomerCount());
    }
}