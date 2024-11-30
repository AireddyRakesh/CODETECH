package Task_3;

//Product.java
public class Product {
 private String name;
 private String id;
 private int quantity;
 private double price;

 public Product(String id, String name, int quantity, double price) {
     this.id = id;
     this.name = name;
     this.quantity = quantity;
     this.price = price;
 }

 // Getters and Setters
 public String getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public int getQuantity() {
     return quantity;
 }

 public void setQuantity(int quantity) {
     this.quantity = quantity;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 @Override
 public String toString() {
     return "ID: " + id + ", Name: " + name + ", Quantity: " + quantity + ", Price: $" + price;
 }
}

