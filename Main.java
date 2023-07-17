import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
// Create order items
        OrderItem item1 = new OrderItem(1, "Item 1", 10.0);
        OrderItem item2 = new OrderItem(2, "Item 2", 20.0);
        OrderItem item3 = new OrderItem(2, "Item 2", 20.0);

// Create a customer
        Customer customer = new Customer(1, "John", "Doe", "john@example.com", "123 Street", CustomerType.VIP, 0.1);
        Customer customer2 = new Customer(1, "Doe", "John", "Doe@example.com", "456 Street", CustomerType.VIP, 0.5);

// Create an order and add items
        ArrayList<OrderItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Order order = new Order(2, "Order 1", "123 Street", items, customer, PaymentType.OTHER, "2023-07-17");

// Add the order items to the customer's favorite items list
        for (OrderItem item : items) {
            customer.addFavoriteItem(items);
            }


// Take a gift and open it
        CustomerGift gift = new CustomerGift();
        customer.takeGift(gift);
        customer.openGift();
        customer.removeFavoriteItems(customer.getFavoriteItems());
        customer2.takeGift(gift);
        customer2.openGift();

// Retrieve order details
        System.out.println("Order ID: " + order.getId());
        System.out.println("Order Name: " + order.getName());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());
        System.out.println("Items: ");
        for (OrderItem item : order.getItems()) {
            System.out.println("  - " + item.getItemName() + ": $" + item.getItemPrice());
        }
        System.out.println("Customer: " + order.getCustomer().getFirstName() + " " + order.getCustomer().getLastName());
        System.out.println("Total Price: $" + order.getTotalPrice());
        System.out.println("Payment Type: " + order.getPaymentType());
        System.out.println("Order Date: " + order.getOrderDate());

        }
    }
