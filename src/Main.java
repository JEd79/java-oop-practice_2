public class Main {
    public static void main (String [] args) {
        Customer c1 = new Customer("Jason");
        

        System.out.println(c1.getName());
        System.out.println(c1.getCustomerCount());
        System.out.println(c1.getCustomerId());

        Customer c2 = new Customer("Nicola");
        System.out.println(c2.getName());
        System.out.println(c2.getCustomerCount());
        System.out.println(c2.getCustomerId());

        PremiumCustomer c3 = new PremiumCustomer("Jim", 0.15);
        System.out.println(c3.getName());
        System.out.println(c3.getDiscountRate());
        System.out.println(c2.getCustomerId());

    }
}