package Task_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InventoryGUI {
    private JFrame frame;
    private JTextField txtProductId, txtProductName, txtQuantity, txtPrice;
    private JTextArea txtArea;
    private InventoryManager manager;

    public InventoryGUI(InventoryManager manager) {
        this.manager = manager;
        frame = new JFrame("Inventory Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Components
        txtProductId = new JTextField(10);
        txtProductName = new JTextField(10);
        txtQuantity = new JTextField(5);
        txtPrice = new JTextField(5);
        txtArea = new JTextArea(10, 30);
        txtArea.setEditable(false);

        JButton btnAdd = new JButton("Add Product");
        btnAdd.addActionListener(e -> addProduct());

        frame.add(new JLabel("Product ID:"));
        frame.add(txtProductId);
        frame.add(new JLabel("Product Name:"));
        frame.add(txtProductName);
        frame.add(new JLabel("Quantity:"));
        frame.add(txtQuantity);
        frame.add(new JLabel("Price:"));
        frame.add(txtPrice);
        frame.add(btnAdd);
        frame.add(new JScrollPane(txtArea));

        frame.setVisible(true);
    }

    private void addProduct() {
        String id = txtProductId.getText();
        String name = txtProductName.getText();
        int quantity = Integer.parseInt(txtQuantity.getText());
        double price = Double.parseDouble(txtPrice.getText());

        Product product = new Product(id, name, quantity, price);
        manager.addProduct(product);
        txtArea.append("Product added: " + product + "\n");
    }

    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        new InventoryGUI(manager);
    }
}
