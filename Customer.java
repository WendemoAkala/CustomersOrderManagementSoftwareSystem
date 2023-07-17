import java.util.ArrayList;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Double customerDiscount;
    private ArrayList<OrderItem> favoriteItems;
    private CustomerGift customerGift;

    public Customer(int id, String firstName, String lastName, String email, String deliveryAddress,
                    CustomerType customerType, Double customerDiscount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        this.favoriteItems = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Double getCustomerDiscount() {
        return customerDiscount;
    }

    public ArrayList<OrderItem> getFavoriteItems() {
        return favoriteItems;
    }

    public void addFavoriteItem(ArrayList<OrderItem> newItems) {
        for (OrderItem item : newItems) {
            if (!favoriteItems.contains(item)) {
                favoriteItems.add(item);
            }
        }
    }

    public void removeFavoriteItems(ArrayList<OrderItem> itemsToRemove) {
        favoriteItems.removeAll(itemsToRemove);
    }

    public void takeGift(CustomerGift gift) {
        this.customerGift = gift;
    }

    public void openGift() {
        if (customerGift != null) {
            customerGift.openGift();
        }
    }

//    public void addFavoriteItem(OrderItem item) {
//    }


}
