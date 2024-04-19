import java.util.ArrayList;
import java.util.List;
class Supermarket {
    private List<Product> inventory;

    public Supermarket() {
        this.inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public Product findProduct(String productName) {
        for (Product product : inventory) {
            if (product.getName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }

    public void makePurchase(Customer customer) {
        for (Product product : customer.getCart()) {
            Product productInInventory = findProduct(product.getName());
            if (productInInventory != null && productInInventory.getStockQuantity() > 0) {
                productInInventory.setStockQuantity(productInInventory.getStockQuantity() - 1);
            }
        }
        customer.getCart().clear();
    }

    public void showInventory() {
        System.out.println("Inventario:");
        for (Product product : inventory) {
            product.printInfo();
        }
    }
}