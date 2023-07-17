import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OrderItem item1 = new OrderItem(1, "Item 1", 10.0);
        OrderItem item2 = new OrderItem(2, "Item 2", 20.0);
        OrderItem item3 = new OrderItem(2, "Item 3", 30.0);

        Customer customer1 = new Customer(1, "Ben", "Meir", "ben@gmail.com", "123 Street", CustomerType.VIP, 0.1);
        Customer customer2 = new Customer(2, "Amir", "Yosef", "amir@gmail.com", "456 Street", CustomerType.REGULAR, 0.5);
        Customer customer3 = new Customer(2, "Yossi", "Akala", "yossi@gmail.com", "789 Street", CustomerType.REGULAR, 0.5);

        ArrayList<OrderItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        Order order = new Order(1, "Order 1", "123 Street", items, customer1, PaymentType.CASH, "2023-07-17");
        Order order2 = new Order(2, "Order 1", "456 Street", items, customer2, PaymentType.CREDIT_CARD, "2023-07-17");
        Order order3 = new Order(3, "Order 1", "789 Street", items, customer3, PaymentType.OTHER, "2023-07-17");

        for (OrderItem item : items) {
            customer1.addFavoriteItem(items);
            customer2.addFavoriteItem(items);
            customer3.addFavoriteItem(items);
        }



        CustomerGift gift = new CustomerGift();
        customer1.takeGift(gift);
        customer1.openGift();
        customer2.takeGift(gift);
        customer2.openGift();

        System.out.println("Order ID: " + order2.getId());
        System.out.println("Order Name: " + order2.getName());
        System.out.println("Delivery Address: " + order2.getDeliveryAddress());
        System.out.println("Items: ");
        for (OrderItem item : order2.getItems()) {
            System.out.println("  - " + item.getItemName() + ": $" + item.getItemPrice());
        }
        System.out.println("Customer: " + order2.getCustomer().getFirstName() + " " + order2.getCustomer().getLastName());
        System.out.println("Total Price: $" + order2.getTotalPrice());
        System.out.println("Payment Type: " + order2.getPaymentType());
        System.out.println("Order Date: " + order2.getOrderDate());

        }
    }
