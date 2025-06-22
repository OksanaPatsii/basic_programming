package les16.productOperation;

public class Product {
    String name;
    double price;
    int quantity;

    public void reduceQuantity(int amount) {
        quantity = quantity - amount;
        System.out.println("Vom Lager wurden " + amount + " Stück ausgebucht");
    }

    public void printProductInfo() {
        System.out.println("Waren: " + name + " kostet " + price + " Euro, " + quantity + " Stück verfügbar.");
    }
}
