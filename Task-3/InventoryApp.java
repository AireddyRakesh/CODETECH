package Task_3;

import java.util.Scanner;

public class InventoryApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManager manager = new InventoryManager();
        UserAuthentication auth = new UserAuthentication();

        // User login
        System.out.println("Welcome to the Inventory Management System");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (!auth.authenticate(username, password)) {
            System.out.println("Invalid username or password.");
            return;
        }

        System.out.println("Login successful!");

        boolean running = true;
        while (running) {
            System.out.println("\nInventory Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Remove Product");
            System.out.println("4. View Products");
            System.out.println("5. Low Stock Report");
            System.out.println("6. Sales Summary");
            System.out.println("7. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Product
                    System.out.print("Enter product ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    manager.addProduct(new Product(id, name, quantity, price));
                    break;

                case 2:
                    // Edit Product
                    System.out.print("Enter product ID to edit: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new quantity: ");
                    quantity = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    price = scanner.nextDouble();
                    manager.updateProduct(id, quantity, price);
                    break;

                case 3:
                    // Remove Product
                    System.out.print("Enter product ID to remove: ");
                    id = scanner.nextLine();
                    manager.removeProduct(id);
                    break;

                case 4:
                    // View all products
                    manager.viewProducts();
                    break;

                case 5:
                    // Low Stock Report
                    System.out.println("Low Stock Products:");
                    for (Product p : manager.lowStockReport()) {
                        System.out.println(p);
                    }
                    break;

                case 6:
                    // Sales Summary
                    manager.salesSummary();
                    break;

                case 7:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
