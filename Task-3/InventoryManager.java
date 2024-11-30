package Task_3;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class InventoryManager {

    private Map<String, Product> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    // Add a product to inventory
    public void addProduct(Product product) {
        inventory.put(product.getId(), product);
    }

    // Update product details
    public void updateProduct(String id, int newQuantity, double newPrice) {
        Product product = inventory.get(id);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Remove a product from inventory
    public void removeProduct(String id) {
        if (inventory.remove(id) == null) {
            System.out.println("Product not found!");
        }
    }

    // View all products
    public void viewProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    // Generate low-stock report (e.g., less than 5 items in stock)
    public List<Product> lowStockReport() {
        List<Product> lowStockProducts = new ArrayList<>();
        for (Product product : inventory.values()) {
            if (product.getQuantity() < 5) {
                lowStockProducts.add(product);
            }
        }
        return lowStockProducts;
    }

    // Generate sales summary (example: sales = price * quantity)
    public void salesSummary() {
        double totalSales = 0.0;
        for (Product product : inventory.values()) {
            totalSales += product.getPrice() * product.getQuantity();
        }
        System.out.println("Total sales value: $" + totalSales);
    }
}
