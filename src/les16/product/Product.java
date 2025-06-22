package les16.product;

public class Product {
    String name;
    double price;

    public void printInfo() {
        System.out.println("Produkt: " + name + " kostet " + price + " Euro" );
    }

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static double getTotalPrice(double priceA, double priceB, double discount) {
        return (priceA + priceB) - 100;
    }
}
