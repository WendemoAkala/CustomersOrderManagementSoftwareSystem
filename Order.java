import java.util.ArrayList;

public class Order {
    private int id;
    private String name;
    private String deliveryAddress;
    private ArrayList<OrderItem> items;
    private Customer customer;
    private double totalPrice;
    private PaymentType paymentType;
    private String orderDate;

    public Order(int id, String name, String deliveryAddress, ArrayList<OrderItem> items, Customer customer,
                 PaymentType paymentType, String orderDate) {
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.items = items;
        this.customer = customer;
        this.totalPrice = calculateTotalPrice();
        this.paymentType = paymentType;
        this.orderDate = orderDate;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public String getOrderDate() {
        return orderDate;
    }

    private double calculateTotalPrice() {
        double total = 0.0;
        for (OrderItem item : items) {
            total += item.getItemPrice();
        }

        if (customer.getCustomerType() == CustomerType.VIP) {
            if (customer.getCustomerDiscount() != null) {
                total -= total * customer.getCustomerDiscount();
            } else {
                throw new IllegalStateException("VIP customer should have a discount specified");
            }
        }

        return total;
    }
}
