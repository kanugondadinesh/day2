class Product {
    String productName;
    int quantity;
    double price;
    Product() {
        this.productName = "Unknown";
        this.quantity = 1;
        this.price = 100;
    }
    Product(String productName) {
        this.productName = productName;
        this.quantity = 1;
        this.price = 100;
    }
    Product(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    void calculateTotal() {
        System.out.println("Product: " + productName);
        System.out.println("Total Price: ₹" + (quantity * price));
        System.out.println("-------------------------");
    }
}
public class Task31 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Keyboard");
        Product p3 = new Product("Monitor", 2, 8500.0);
        p1.calculateTotal();
        p2.calculateTotal();
        p3.calculateTotal();
    }
}