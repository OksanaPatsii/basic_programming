package les17.methods;

public class Product {
    String productName;
    String productProducer;

    public Product(String productName, String productProducer) {
        this.productName = productName;
        this.productProducer = productProducer;
    }


    public void productInfo() {
        System.out.println("Hersteller: " + productProducer + ", Name: " + productName);
    }

}
