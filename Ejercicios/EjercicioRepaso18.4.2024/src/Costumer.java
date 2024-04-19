import java.util.ArrayList;
import java.util.List;
class Customer {
    private String firstName;
    private String lastName;
    private List<Product> cart;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cart = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }

    public List<Product> getCart() {
        return cart;
    }
}