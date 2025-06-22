package les16.productOperation;

public class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Samsung S24 Ultra";
        product1.price = 990;
        product1.quantity = 28;

        product1.printProductInfo();
        product1.reduceQuantity(7);
        product1.printProductInfo();

    }
}
