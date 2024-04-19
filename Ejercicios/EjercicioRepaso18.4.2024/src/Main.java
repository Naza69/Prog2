//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Leche", 2.5, 10);
        Product product2 = new Product("Pan", 1.0, 20);
        Product product3 = new Product("Cereal", 3.0, 15);

        // Create supermarket
        Supermarket supermarket = new Supermarket();
        supermarket.addProduct(product1);
        supermarket.addProduct(product2);
        supermarket.addProduct(product3);

        // Create customer
        Customer customer = new Customer("John", "Doe");

        // Add products to customer's cart
        customer.addToCart(product1);
        customer.addToCart(product2);
        customer.addToCart(product3);

        // Make purchase
        supermarket.makePurchase(customer);

        // Show inventory after purchase
        supermarket.showInventory();
    }
}