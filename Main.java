public class Main {

    
    static int getPrice(int productId) {

        if (productId == 1) {
            return 10;   // Pen
        }
        else if (productId == 2) {
            return 50;   // Book
        }
        else {
            return -1;   // Invalid product
        }
    }

  
    static double calculateTotal(double price, int qty) {
        return price * qty;
    }

  
    static void printProduct(int id) {
        System.out.println("Product ID: " + id);
    }

    
    static void printProduct(int id, String name) {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
    }

    
    static void printProduct(int id, String name, double price) {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }

    public static void main(String[] args) {

        int productId = 1;

        int price = getPrice(productId);
        System.out.println("Price: " + price);

        double total = calculateTotal(price, 3);
        System.out.println("Total Amount: " + total);

      
        printProduct(1);
        printProduct(1, "Pen");
        printProduct(1, "Pen", 10);
    }
}
