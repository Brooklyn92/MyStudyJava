package other.other.aggregation;

public class AggregationTest {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "johndoe@example.com");
        Order order = new Order(1, customer);

        System.out.println("Order #" + order.getOrderId() + " belongs to " + order.getCustomer().getName());
    }
}
