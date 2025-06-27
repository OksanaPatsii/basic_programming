package les18.publicAndPrivate.product;

public class Product {
    private String productName;
    private String productProducer;
    private double productPrice;
    private boolean isDiscount;

    public Product(String productName, String productProducer, double productPrice, boolean isDiscount) {
        this.productName = productName;
        this.productProducer = productProducer;
        this.productPrice = productPrice;
        this.isDiscount = isDiscount;
    }

    public void printInfo() {
        System.out.println("Produktname: " + productName);
        System.out.println("Hersteller: " + productProducer);
        System.out.println("Produktpreis: " + productPrice);
    }

    public String returnValueProductName() {
        return productName;
    }

    public void changeIsDiscount(boolean newValueIsDiscount) {
isDiscount = newValueIsDiscount;
    }

    public boolean returnValueIsDiscount() {
        return isDiscount;
    }
}